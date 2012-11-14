import junit.framework.TestCase;


public class PosicionTest extends TestCase {

	private Posicion posicion1;
	private Posicion posicion2;
	private Posicion posicion3;
	private Posicion posicion4;

	
	public void setUp() 
	{
		posicion1 = new Posicion(0,0);
		posicion2 = new Posicion(1,2);
		posicion3 = new Posicion(-2,-3);
		posicion4 = new Posicion(-5,3);
		

	}
	
	public void testCompararA()
	{
		assertTrue (posicion1.compararA(posicion1));
		
	}
	
	public void testGetX()
	{
	
		assertTrue (posicion1.getX() == 0);
	}
	

}
