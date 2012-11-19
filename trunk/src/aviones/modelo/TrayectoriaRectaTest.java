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
		Posicion posDeLlegada = new Posicion(1.2683,2.8658) ;
		assertTrue ( trayectoria.getPosActual().compararA(posDeLlegada));	
	}
	
	public void testAvanzarHastaPoscionFinal()
	{
		TrayectoriaRecta trayectoria = new TrayectoriaRecta(pInicial, pFinal, velocidad);
		for( int step = 0; step < 7; step++)
		{trayectoria.avanzar();}
	
		assertTrue ( trayectoria.getPosActual().compararA(pFinal));	
	}

}
