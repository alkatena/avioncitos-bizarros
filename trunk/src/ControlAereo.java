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
			iterador.next().actualizar();
		
		this.controlarChoques();
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
					//Se perdio el juego, chocaron 2 aviones
				}	
			}
			contador++;
			iteradorInterno = listaAviones.listIterator();		
		}
	}
	
}
