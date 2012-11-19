package aviones.modelo;
import junit.framework.TestCase;


public class TrayectoriaRectaTest extends TestCase 
{

	private Posicion pInicial;
	private Posicion pFinal;
	private double velocidad;
	
	public void setUp() 
	{
		pInicial = new Posicion(1,3);
		pFinal = new Posicion(3,2);
		velocidad = 0.3;
	}

	
	public void testAvanzarUnPaso()
	{
		TrayectoriaRecta trayectoria = new TrayectoriaRecta(pInicial, pFinal, velocidad);
		trayectoria.avanzar();

		assertTrue ( (trayectoria.getPosActual().getX() == 1.6) );	
		assertTrue (trayectoria.getPosActual().getY() == 2.7);	
	}

	public void testAvanzarVariosPasos()
	{
		TrayectoriaRecta trayectoria = new TrayectoriaRecta(pInicial, pFinal,velocidad);
		trayectoria.avanzar();
		trayectoria.avanzar();
		
		assertTrue ( (trayectoria.getPosActual().getX() == 2.2) );	
		assertTrue (trayectoria.getPosActual().getY() == 2.4);
	}
	
}
