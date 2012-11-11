import java.util.ArrayList;
import java.util.ListIterator;


public class Radar 
{
	private Mapa map = Mapa.getMapa();
	
	public ArrayList<Aeronave> obtenerAviones()
	{
		return map.devolverAviones();
	}
	
	public ArrayList<Aeronave> obtenerAviones(TipoNave tam)
	{
		ListIterator<Aeronave> iterador = map.devolverAviones().listIterator();
		ArrayList<Aeronave> listaFiltrada = new ArrayList<Aeronave>();
		while (iterador.hasNext())
		{
			Aeronave elemento = iterador.next();
			if( elemento.getTamanio() == tam )
			{
				listaFiltrada.add(elemento);
			}
		}		
		return listaFiltrada;
	}
}
