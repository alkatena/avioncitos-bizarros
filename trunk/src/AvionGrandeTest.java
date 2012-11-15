import junit.framework.TestCase;


public class AvionGrandeTest extends TestCase {

	AvionGrande boeing777;
	AvionGrande aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion otraPInicial;
	Posicion pInicialColision;
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			pInicialColision = new Posicion(1,6);
			otraPInicial = new Posicion(9,9);
			boeing777 = new AvionGrande();
			aeronaveChocadora = new AvionGrande();
			aeronaveNoChocadora = new AvionChico();
			aeronaveNoChocadora.setPosicion(otraPInicial);
			aeronaveChocadora.setPosicion(pInicialColision);
			boeing777.setPosicion(pInicial);
	}

	
	public void testActualizarTrayectoria()
	{
		Posicion posicionFinal = new Posicion(2,0);
		boeing777.actualizarTrayectoria(posicionFinal);
		TrayectoriaRecta trayectoriaNueva = boeing777.getTrayectoria();
		
		assertTrue ( (trayectoriaNueva.getPtoFinal()== posicionFinal) );	
	}

	public void testactualizarPosicion()
	{
		Posicion posicionFinal = new Posicion(4,0);
		boeing777.actualizarTrayectoria(posicionFinal);
		boeing777.actualizar();
		assertTrue (boeing777.getPosicion().getX() == 3.7);
	}  
	
	public void testColisionEntreDosAviones()
	{
		assertTrue (boeing777.colisionoCon(aeronaveChocadora));		
	}
	
	public void testNoColisionEntreDosAviones()
	{
		assertFalse (boeing777.colisionoCon(aeronaveNoChocadora));		
	}
	
	}
