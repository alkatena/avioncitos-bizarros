import junit.framework.TestCase;

/* Muchachos, extra�o las pruebas de smalltalk, java en esto es bien mierda;
 * 1) Limitaciones, ojo que si cambian una de estas posiciones random, como se usan en
 * distintas pruebas, muchas les pueden fallar ( java si funciona pero da otro resultado no 
 * marca amarillo como smalltalk te pone rojo, UNA VERGA!)
 * 2) la unica que esta hecha con distintas variables es testDistanciaCon que seria otra
 * modalidad, es decir que cada metodo tuviera sus propias variables adentro y sea mas facil
 * de cambiar valores sin pinchar o andar corrigiendo todo.
 * 3) se viene lindo quilombo con la precision, es demasiada. En realidad no deberia serlo,
 * pero veremos...No se alarmen aun.
 */

public class PosicionTest extends TestCase {

	private Posicion posicion1;
	private Posicion posicion2;
	private Posicion posicion3;
	private Posicion posicion4;
	private Posicion auxiliar;
	double escalar;

	
	public void setUp() 
	{
		posicion1 = new Posicion(0.0007,0.00504);
		posicion2 = new Posicion(1,2);
		posicion3 = new Posicion(-2.2,-3);
		posicion4 = new Posicion(-5.1,3);
		escalar = 0.3;
	}
	
	public void testCompararA()
	{
		assertTrue (posicion1.compararA(posicion1));
		
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
}
