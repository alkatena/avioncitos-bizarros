import junit.framework.TestCase;


public class AvionChicoTest extends TestCase {

	AvionChico avioneta;
	AvionChico aeronaveChocadora;
	Posicion pInicial;
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			avioneta = new AvionChico();
			aeronaveChocadora = new AvionChico();
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
	public void actualizarPosicion()
	{
		Posicion posicionFinal = new Posicion(4,0);
		avioneta.actualizarTrayectoria(posicionFinal);
		avioneta.actualizar();
		assertTrue (posicionFinal.getX() == 1.9);
	}  // Este test pasa la prueba y no debería
	
	
	
	}
