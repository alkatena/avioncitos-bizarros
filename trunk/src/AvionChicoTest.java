import junit.framework.TestCase;


public class AvionChicoTest extends TestCase {

	public class TrayectoriaRectaTest extends TestCase {
	
		private double velocidad;
		private TamanioAeronave tamanio;
		private TrayectoriaRecta trayectoria;
	
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
		
		TrayectoriaRecta trayectoria = new TrayectoriaRecta(pInicial, pFinal);
		trayectoria.avanzar(velocidad);
		trayectoria.avanzar(velocidad);
		assertTrue ( (trayectoria.getPosActual().getX() == 2.2) );	
		assertTrue (trayectoria.getPosActual().getY() == 2.4);		
		// van a ser 3 avances
		
		
		
		
	}
	
	}
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
		
		TrayectoriaRecta trayectoria = new TrayectoriaRecta(pInicial, pFinal);
		trayectoria.avanzar(velocidad);
		trayectoria.avanzar(velocidad);
		assertTrue ( (trayectoria.getPosActual().getX() == 2.2) );	
		assertTrue (trayectoria.getPosActual().getY() == 2.4);		
		// van a ser 3 avances
		
		
		
		
	}
	
	}
