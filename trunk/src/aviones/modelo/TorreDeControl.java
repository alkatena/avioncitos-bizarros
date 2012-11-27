package aviones.modelo;
import java.util.ArrayList;
import java.util.ListIterator;

public class TorreDeControl
{

	private Pista pista;
	private Radar radar = new Radar();
	private Aeronave avionEliminado = null;
	
	public TorreDeControl(Pista unaPista)
	{
		pista = unaPista;
	}
	
	public void actualizar()
	{
		ArrayList<Aeronave> listaAviones = radar.obtenerAviones();
		ListIterator<Aeronave> iterador = listaAviones.listIterator();
		while (iterador.hasNext())
		{
			Aeronave avion = iterador.next();
			if (avion.puedeAterrizarEn(pista) && pista.colisionoCon(avion))
			{
				avionEliminado = avion;
			}
		}
		if(avionEliminado != null)
			{pista.aterrizar(avionEliminado);avionEliminado = null;}
	}

}
