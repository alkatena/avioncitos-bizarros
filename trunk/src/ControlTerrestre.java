import java.util.ArrayList;
import java.util.ListIterator;


public class ControlTerrestre 
{

	private ArrayList<TorreDeControl> listaTorres = new ArrayList<TorreDeControl>();
	
	public void agregarPista(Pista pista)
	{
		TorreDeControl torre = new TorreDeControl(pista);
		listaTorres.add(torre);
	}
	
	
	public void actualizar()
	{
		ListIterator<TorreDeControl> iterador = listaTorres.listIterator();
		while (iterador.hasNext())
		{
			iterador.next().actualizar();
		}
	}
}
