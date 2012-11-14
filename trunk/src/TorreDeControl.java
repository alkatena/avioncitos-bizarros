import java.util.ArrayList;
import java.util.ListIterator;

public class TorreDeControl
{

	private Pista pista;
	private Radar radar = new Radar();
	public TorreDeControl(Pista unaPista)
	{
		pista = unaPista;
	}
	
	public void actualizar()
	{
		ArrayList<Aeronave> listaAviones = radar.obtenerAviones(pista.getTamanio());
		ListIterator<Aeronave> iterador = listaAviones.listIterator();
		while (iterador.hasNext())
		{
			Aeronave avion = iterador.next();
			if (pista.colisionoCon(avion))
			{
				pista.aterrizar(avion);
			}
		}		
	}

}
