package aviones.modelo;
import java.util.ArrayList;
import java.util.ListIterator;


public class Radar 
{
	private Mapa map = Mapa.getMapa();
	
	public ArrayList<Aeronave> obtenerAviones()
	{
		return map.devolverAviones();
	}
	
	public ArrayList<Aeronave> obtenerAviones(TamanioAeronave tam)
	{
		ListIterator<Aeronave> iterador = map.devolverAviones().listIterator();
		ArrayList<Aeronave> listaFiltrada = new ArrayList<Aeronave>();
		while (iterador.hasNext())
		{
			Aeronave avion = iterador.next();
			if(avion.getTamanio().esIgualA(tam))
			{
				listaFiltrada.add(avion);
			}
		}		
		return listaFiltrada;
	}
	
	public Aeronave obtenerAvion(Posicion pos)
	{
		ArrayList<Aeronave> lista = this.obtenerAviones();
		ListIterator<Aeronave> iterador = lista.listIterator();
		while (iterador.hasNext())
		{
			AvionFalso avionFalso = new AvionFalso(pos);
			Aeronave avion = iterador.next();
			if(avion.colisionoCon(avionFalso))
				return avion;
		}
		return null;
	}
	
	public ArrayList<Pista> obtenerPistas()
	{
		return map.devolverPistas();
	}
}
