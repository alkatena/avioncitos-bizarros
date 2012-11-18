package aviones.modelo;
import junit.framework.TestCase;


public class AvionGrandeTest extends TestCase {

	AvionGrande boeing777;
	AvionGrande aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion otraPInicial;
	Posicion pInicialColision;
	Posicion trayect;
	
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			pInicialColision = new Posicion(1,6);
			otraPInicial = new Posicion(9,9);
			trayect = new Posicion (4,0);
			
			boeing777 = new AvionGrande(pInicial, trayect);
			aeronaveChocadora = new AvionGrande(pInicialColision, trayect);
			aeronaveNoChocadora = new AvionChico(otraPInicial, trayect);
	}

	
	public void testactualizarPosicion()
	{
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
