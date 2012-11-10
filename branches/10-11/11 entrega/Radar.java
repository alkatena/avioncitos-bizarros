import java.util.ArrayList;
import java.util.Iterator;


public class Radar 
{
	private Mapa map;
	
	public Radar(Mapa map)
	{
		this.map = map;
	}
	
	public ArrayList<Posicion> posicionesDeAviones()
	{
		ArrayList<TorreDeControl> listaTorres;
		listaTorres = map.getTorres();
		Iterator<TorreDeControl> iterador = listaTorres.listIterator();
		ArrayList<Posicion> listaPosiciones = new ArrayList<Posicion>();
		while ( iterador.hasNext())
		{
			TorreDeControl torre = iterador.next();
			listaPosiciones.add(torre.posicionAvion());
		}
		return listaPosiciones;
	}
	
	public ArrayList<Posicion> posicionesDePistas()
	{
		ArrayList<Pista> listaPistas;
		listaPistas = map.getPistas();
		Iterator<Pista> iterador = listaPistas.listIterator();
		ArrayList<Posicion> listaPosiciones = new ArrayList<Posicion>();
		while ( iterador.hasNext())
		{
			Pista pista = iterador.next();
			listaPosiciones.add(pista.getPosicion());
		}
		return listaPosiciones;
	}
}
