package aviones.modelo;
import junit.framework.TestCase;


public class AvionChicoTest extends TestCase {

	AvionChico avioneta;
	AvionChico aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion otraPInicial;
	Posicion pInicialColision;
	Posicion trayect;
	double vel = 0.5;
	
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			pInicialColision = new Posicion(1,1);
			otraPInicial = new Posicion(9,9);
			trayect = new Posicion (4,0);
			avioneta = new AvionChico(pInicial, trayect, vel);
			aeronaveChocadora = new AvionChico(pInicialColision,trayect, vel);
			aeronaveNoChocadora = new AvionChico(otraPInicial,trayect, vel);
	}

	
	public void testactualizarPosicion()
	{
		avioneta.actualizar();
		assertTrue (avioneta.getPosicion().getX() == 1.9);
	}  
	
	public void testColisionEntreDosAviones()
	{
		assertTrue (avioneta.colisionoCon(aeronaveChocadora));		
	}
	
	public void testNoColisionEntreDosAviones()
	{
		assertFalse (avioneta.colisionoCon(aeronaveNoChocadora));		
	}
	
	}
