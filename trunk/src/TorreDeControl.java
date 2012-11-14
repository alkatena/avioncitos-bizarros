import java.util.ArrayList;
import java.util.ListIterator;

public class TorreDeControl
{

	private Pista pista;
	public TorreDeControl(Pista unaPista)
	{
		pista = unaPista;
	}
	
	public void actualizar()
	{
		Radar radar = Mapa.getMapa().getRadar();
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
