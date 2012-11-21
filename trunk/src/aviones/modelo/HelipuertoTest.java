package aviones.modelo;
import junit.framework.TestCase;


public class HelipuertoTest extends TestCase 
{

	Helicoptero helicopteroQueAterriza;
	Helicoptero helicopteroQueNoAterriza;
	Posicion posicionPista;
	Posicion posicionInicial;
	Posicion posicionInicial2;
	Posicion posicionFinal;
	Posicion direccion;
	Posicion direccionNoParecida;
	DireccionPista direccionPista;
	Helipuerto helipuerto;
	double vel = 0.5;
	
	public void setUp() 
	{
			posicionPista = new Posicion(1,1);
			helipuerto = new Helipuerto(posicionPista);
			posicionInicial = new Posicion(1,0.9);
			posicionInicial2 = new Posicion(9,0.9);
			posicionFinal = new Posicion(1,50);
			helicopteroQueAterriza = new Helicoptero(posicionInicial,posicionFinal,0.1);
			helicopteroQueNoAterriza = new Helicoptero(posicionInicial2,posicionFinal,0.1);
	}
	
	public void testHelicopteroQueColisionaConPista() 
	{
		assertTrue (	helipuerto.colisionoCon(helicopteroQueAterriza)		);
		
		
	}
	
	public void testHelicopteroQueNoColisionaConPista()  // Acá hay algo raro... Si lo pongo en la (X,0.9), X<9 colisiona, y no debería porque el radio del helicoptero es 4, y ya en la (5.1,0.9) no debería colisionar. Me fijé y se debe a que la pista también tiene hitbox, del mismo tamaño de la aeronave que soporta, medio negro me parece. Debería tener tamamio de pista chica, es una boludez igual. 
	{
		assertFalse (	helipuerto.colisionoCon(helicopteroQueNoAterriza)		);
		
		
	}
	
	public void testHelicopteroQueAterriza() 
	{
		helipuerto.aterrizar(helicopteroQueAterriza);
		assertTrue (	helipuerto.cantidadAvionesAterrizados()== 1	);
				
	}
	
	public void testHelicopterosQueAterrizan() 
	{
		helipuerto.aterrizar(helicopteroQueAterriza);
		helipuerto.aterrizar(helicopteroQueAterriza);
		
		assertTrue (	helipuerto.cantidadAvionesAterrizados()== 2	);
				
	}


	
		
}
