package aviones.modelo;
import java.util.LinkedList;
import java.util.Queue;

public class Recorrido 
{
	private Queue<Posicion> posiciones = new LinkedList<Posicion>();
	public TrayectoriaRecta trayectoria;
	private Posicion posFinal;
	
	public Recorrido(Posicion inicio, Posicion fin)
	{
		trayectoria = new TrayectoriaRecta(inicio, fin);
		posFinal = fin;
	}
	
	public void setPosiciones (Queue<Posicion> pos)
	{
		posiciones = pos;
		posFinal = posiciones.poll();
		trayectoria = new TrayectoriaRecta(trayectoria.getPosActual(), posFinal);
	}
	
	public void avanzar(double vel)
	{
		if (trayectoria.getPosActual().compararA(posFinal)) //COMPARA EXACTO; ESTA MAL?
		{
			posFinal = posiciones.poll();
			if (posFinal != null)
				trayectoria = new TrayectoriaRecta(trayectoria.getPosActual(), posFinal);
		}
		trayectoria.avanzar(vel);
	}
	
	public Posicion getPosicion()
	{	return trayectoria.getPosActual();	}
	
	public Direccion getDireccion()
	{	return trayectoria.getDireccion(); }
	
	public Posicion getPtoFinal()
	{
		return posFinal;
	}
	
}
