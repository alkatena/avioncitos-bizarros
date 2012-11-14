import junit.framework.TestCase;


public class TrayectoriaRectaTest extends TestCase {

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
		TrayectoriaRecta trayectoria = new TrayectoriaRecta(pInicial, pFinal);
		trayectoria.avanzar(velocidad);

		assertTrue ( (trayectoria.getPosActual().getX() == 1.6) );	
		assertTrue (trayectoria.getPosActual().getY() == 2.7);	
	}
	//haicendo
	public void testAvanzarVariosPasos()
	{
		// van a ser 3 avances
		
		
		
		
	}
	
	}
