import junit.framework.TestCase;


public class AvionChicoTest extends TestCase {

	AvionChico avioneta;
	AvionChico aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion otraPInicial;
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			otraPInicial = new Posicion(9,9);
			avioneta = new AvionChico();
			aeronaveChocadora = new AvionChico();
			aeronaveNoChocadora = new AvionChico();
			aeronaveNoChocadora.setPosicion(otraPInicial);
			aeronaveChocadora.setPosicion(pInicial);
			avioneta.setPosicion(pInicial);
	}

	
	public void testActualizarTrayectoria()
	{
		Posicion posicionFinal = new Posicion(2,0);
		avioneta.actualizarTrayectoria(posicionFinal);
		TrayectoriaRecta trayectoriaNueva = avioneta.getTrayectoria();
		
		assertTrue ( (trayectoriaNueva.getPtoFinal()== posicionFinal) );	
	}
	//haicendo
	public void testactualizarPosicion()
	{
		Posicion posicionFinal = new Posicion(4,0);
		avioneta.actualizarTrayectoria(posicionFinal);
		avioneta.actualizar();
		assertTrue (avioneta.getPosicion().getX() == 1.8999999999999999);
	}  // Este test pasa la prueba y no debería
	
	public void testColisionEntreDosAviones()
	{
		assertTrue (avioneta.colisionoCon(aeronaveChocadora));		
	}
	
	public void testNoColisionEntreDosAviones()
	{
		assertFalse (avioneta.colisionoCon(aeronaveNoChocadora));		
	}
	
	}
