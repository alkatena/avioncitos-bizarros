package aviones.modelo;
import java.util.ArrayList;
import java.util.ListIterator;


public class ControlAereo 
{
	private Radar radar = new Radar();
	
	public void actualizar()
	{
		ArrayList<Aeronave> listaAviones = radar.obtenerAviones();
		ListIterator<Aeronave> iterador = listaAviones.listIterator();
		while (iterador.hasNext())
		{
			Aeronave avion = iterador.next();
			avion.actualizar();
			if (this.posicionInvalida(avion))
			{
				Mapa.getMapa().eliminarAvion(avion);
			}
		}
		
		this.controlarChoques();
	}
	
	
	private boolean posicionInvalida(Aeronave avion)
	{
		return (!( Mapa.getMapa().estaDentroDeLimites(avion.getPosicion()) ));
	}
	
	private void controlarChoques()
	{
		ArrayList<Aeronave> listaAviones = radar.obtenerAviones();
		ListIterator<Aeronave> iterador = listaAviones.listIterator();
		ListIterator<Aeronave> iteradorInterno = listaAviones.listIterator();
		int contador = 1;
		while (iterador.hasNext())
		{
			Aeronave avion = iterador.next();
			for(int i=0;i<contador;i++)
				iteradorInterno.next();
			while(iteradorInterno.hasNext())
			{
				if (avion.colisionoCon(iteradorInterno.next()))
				{
					/*
					 * Aca se perdio el juego porque chocaron 2 aviones
					 */
				}	
			}
			contador++;
			iteradorInterno = listaAviones.listIterator();		
		}
	}
	
}
