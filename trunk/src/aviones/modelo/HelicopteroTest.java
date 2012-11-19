package aviones.modelo;
import junit.framework.TestCase;


public class HelicopteroTest extends TestCase {

	Helicoptero helicopteroPresidencial;
	Helicoptero aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion otraPInicial;
	Posicion pInicialColision;
	Posicion trayect;
	double vel = 0.5;
	
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			pInicialColision = new Posicion(1,6);
			otraPInicial = new Posicion(9,9);
			trayect = new Posicion (4,0);
			helicopteroPresidencial = new Helicoptero(pInicial, trayect, vel);
			aeronaveChocadora = new Helicoptero(pInicialColision, trayect, vel);
			aeronaveNoChocadora = new AvionChico(otraPInicial, trayect, vel);
	}

	
	public void testactualizarPosicion()
	{
		helicopteroPresidencial.actualizar();
		assertTrue (helicopteroPresidencial.getPosicion().getX() == 2.8);
	} 
	
	public void testactualizarPosicionFalse()
	{
		helicopteroPresidencial.actualizar();
		assertFalse (helicopteroPresidencial.getPosicion().getX() == 2.9);
	} 
	
	public void testColisionEntreDosAviones()
	{
		assertTrue (helicopteroPresidencial.colisionoCon(aeronaveChocadora));		
	}
	
	public void testNoColisionEntreDosAviones()
	{
		assertFalse (helicopteroPresidencial.colisionoCon(aeronaveNoChocadora));		
	}
	
	}
