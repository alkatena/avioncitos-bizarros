import junit.framework.TestCase;

public class TrayectoriaRectaTest extends TestCase 
{

	private Posicion pInicial;
	private Posicion pFinal;
	private double velocidad;
	private Posicion pActual;
	
	public void setUp() 
	{
		pInicial = new Posicion(1,3);
		pFinal = new Posicion(3,2);
		velocidad = 0.3;
	}

	
	public void testAvanzarUnPaso()
	{
		TrayectoriaRecta trayectoria = new TrayectoriaRecta(pInicial, pFinal);
		pActual = trayectoria.avanzar(velocidad);

		assertTrue ( pActual.getX() == 1.6);	
		assertTrue ( pActual.getY() == 2.4);	
	}

}
