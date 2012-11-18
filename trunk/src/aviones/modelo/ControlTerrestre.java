package aviones.modelo;
import java.util.ArrayList;
import java.util.ListIterator;


public class ControlTerrestre 
{

	private ArrayList<TorreDeControl> listaTorres = new ArrayList<TorreDeControl>();
	private Radar radar = new Radar();
	
	private void setearTorreA(Pista pista)
	{
		TorreDeControl torre = new TorreDeControl(pista);
		listaTorres.add(torre);
	}
	
	private void adjuntarPistasNuevas(ArrayList<Pista> listaPista)
	{
		if (listaPista.size() != listaTorres.size())
		{
			ListIterator<Pista> iter = listaPista.listIterator();
			while (iter.hasNext())
			{
				this.setearTorreA(iter.next());
			}
		} 
	}
	
	public void actualizar()
	{
		this.adjuntarPistasNuevas(radar.obtenerPistas());
		ListIterator<TorreDeControl> iterador = listaTorres.listIterator();
		while (iterador.hasNext())
		{
			iterador.next().actualizar();
		}
	}
}
