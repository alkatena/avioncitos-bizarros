import junit.framework.TestCase;


public class HelicopteroTest extends TestCase {

	Helicoptero helicopteroPresidencial;
	Helicoptero aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion otraPInicial;
	Posicion pInicialColision;
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			pInicialColision = new Posicion(1,6);
			otraPInicial = new Posicion(9,9);
			helicopteroPresidencial = new Helicoptero();
			aeronaveChocadora = new Helicoptero();
			aeronaveNoChocadora = new AvionChico();
			aeronaveNoChocadora.setPosicion(otraPInicial);
			aeronaveChocadora.setPosicion(pInicialColision);
			helicopteroPresidencial.setPosicion(pInicial);
	}

	
	public void testActualizarTrayectoria()
	{
		Posicion posicionFinal = new Posicion(2,0);
		helicopteroPresidencial.actualizarTrayectoria(posicionFinal);
		TrayectoriaRecta trayectoriaNueva = helicopteroPresidencial.getTrayectoria();
		
		assertTrue ( (trayectoriaNueva.getPtoFinal()== posicionFinal) );	
	}

	public void testactualizarPosicion()
	{
		Posicion posicionFinal = new Posicion(4,0);
		helicopteroPresidencial.actualizarTrayectoria(posicionFinal);
		helicopteroPresidencial.actualizar();
		assertTrue (helicopteroPresidencial.getPosicion().getX() == 2.8);
	} 
	
	public void testactualizarPosicionFalse()
	{
		Posicion posicionFinal = new Posicion(4,0);
		helicopteroPresidencial.actualizarTrayectoria(posicionFinal);
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
