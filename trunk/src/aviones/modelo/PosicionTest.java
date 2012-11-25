package aviones.modelo;
import junit.framework.TestCase;

public class PosicionTest extends TestCase {

	private Posicion posicion1;
	private Posicion posicion2;
	private Posicion posicion3;
	private Posicion posicion4;
	private Posicion posicion5;
	private Posicion posicion6;
	private Posicion auxiliar;
	double escalar;

	
	public void setUp() 
	{
		posicion1 = new Posicion(0.0007,0.00504);
		posicion2 = new Posicion(1,2);
		posicion3 = new Posicion(-2.2,-3);
		posicion4 = new Posicion(-5.1,3);
		posicion5 = new Posicion(1,0);
		posicion6 = new Posicion(0.51,0);
		escalar = 0.3;
	}
	
	public void testCompararAMisma()
	{
		assertTrue (posicion1.compararA(posicion1));
		
	}
	
	public void testCompararADistinta()
	{
		assertTrue (posicion5.compararA(posicion6));
		
	}
	
	public void testGetX()
	{
		assertTrue (posicion3.getX() == -2.2);
	}
	
	public void testRestar()
	{
		auxiliar = posicion2.restar(posicion3);
		assertTrue (auxiliar.getX() == 3.2);
		assertTrue (auxiliar.getY() == 5);
	}
	
	public void testSumar()
	{
		auxiliar = posicion1.sumar(posicion3);
		assertTrue (auxiliar.getX() == -2.1993);
		assertTrue (auxiliar.getY() == -2.99496);
	}
	
	public void testDistanciaCon()
	{
		Posicion unaPos = new Posicion(1,2);
		Posicion otraPos = new Posicion(2,3);
		assertTrue (unaPos.distanciaCon(otraPos) == 1.4142135623730951);
	}
	
	public void testMultiplicarPorEscalar()
	{
		assertTrue(posicion4.multiplicarPorEscalar(escalar).getX() == -1.5299999999999998);
		assertTrue(posicion4.multiplicarPorEscalar(escalar).getY() == 0.8999999999999999);
	}
	public void testNorma()
	{
		assertTrue (posicion5.norma()==1);
	}
	public void testNormalizar()
	{
		posicion5.normalizar();
		assertTrue(posicion5.getX() == 1);
		assertTrue(posicion5.getY() == 0);
	}
}
