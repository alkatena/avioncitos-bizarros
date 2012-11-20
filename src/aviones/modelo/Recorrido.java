package aviones.modelo;
import java.util.LinkedList;
import java.util.Queue;

public class Recorrido 
{
	private Queue<Posicion> posiciones = new LinkedList<Posicion>();
	public TrayectoriaRecta trayectoria;
	private Posicion posFinal;
	private double velocidad;
	
	public Recorrido(Posicion inicio, Posicion fin, double velocidad)
	{
		this.velocidad = velocidad;
		trayectoria = new TrayectoriaRecta(inicio, fin, velocidad);
		posFinal = fin;
		this.posiciones.add(fin);
	}
	
	public void setPosiciones (Queue<Posicion> pos)
	{
		posiciones = pos;
		posFinal = posiciones.poll();
		trayectoria = new TrayectoriaRecta(trayectoria.getPosActual(), posFinal, velocidad);
	}
	
	public void avanzar()
	{
		if (trayectoria.getPosActual().compararA(posFinal)) //COMPARA EXACTO; ESTA MAL?
		{
			posFinal = posiciones.poll();
			if (posFinal != null)
				trayectoria = new TrayectoriaRecta(trayectoria.getPosActual(), posFinal, velocidad);
		}
		trayectoria.avanzar();
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
