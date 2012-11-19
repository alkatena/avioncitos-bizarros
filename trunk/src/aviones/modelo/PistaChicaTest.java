package aviones.modelo;
import junit.framework.TestCase;


public class PistaChicaTest extends TestCase 
{

	AvionChico avionQueAterriza;
	AvionChico avionQueNoAterriza;
	AvionChico otroAvionQueAterriza;
	AvionChico avionQueColisiona;
	AvionChico avionQueNoColisiona;
	Posicion posicionPista;
	Posicion posicionInicial;
	Posicion posicionFinal;
	Posicion direccion;
	Posicion direccionNoParecida;
	DireccionPista direccionPista;
	PistaChica pistaChica;
	double vel = 0.5;
	
	public void setUp() 
	{
			posicionPista = new Posicion(1,1);
			direccion = new Posicion(0,1);
			direccionPista = new DireccionPista(direccion);
			pistaChica = new PistaChica(posicionPista,direccionPista);
	}

	
	public void testAvionQueAterrizaBienConMismaDireccion()
	{
		posicionInicial = new Posicion(1,0.9);
		posicionFinal = new Posicion(1,1.1);
		avionQueAterriza = new AvionChico(posicionInicial, posicionFinal, vel);
		
		//avionQueAterriza.actualizarTrayectoria(posicionFinal);
		pistaChica.aterrizar(avionQueAterriza);
		otroAvionQueAterriza = avionQueAterriza;
		pistaChica.aterrizar(otroAvionQueAterriza);
				
		assertTrue (pistaChica.cantidadAvionesAterrizados() == 2);	
	}
	
	public void testAvionQueAterrizaBienConDireccionParecida()
	{
		posicionInicial = new Posicion(1,0.9);
		posicionFinal = new Posicion(1.1,1.5);
		avionQueAterriza = new AvionChico(posicionInicial, posicionFinal, vel);
	
		//avionQueAterriza.actualizarTrayectoria(posicionFinal);
		pistaChica.aterrizar(avionQueAterriza);
		otroAvionQueAterriza = avionQueAterriza;
		pistaChica.aterrizar(otroAvionQueAterriza);
				
		assertTrue (pistaChica.cantidadAvionesAterrizados() == 2);	
	}
	
	public void testAvionQueNoAterrizaPorDireccionDistina()
	{
		posicionInicial = new Posicion(1,0.9);
		posicionFinal = new Posicion(3,0);
		avionQueNoAterriza = new AvionChico(posicionInicial, posicionFinal, vel);
		
		//avionQueNoAterriza.actualizarTrayectoria(posicionFinal);
		pistaChica.aterrizar(avionQueNoAterriza);
						
		assertTrue (pistaChica.cantidadAvionesAterrizados() == 0);
	}
	
	public void testAvionQueColisiona()
	{
		posicionInicial = new Posicion(1,0.9);
		Posicion trayect = new Posicion (3,3);
		avionQueColisiona = new AvionChico(posicionInicial, trayect, vel);
		
		assertTrue (pistaChica.colisionoCon(avionQueColisiona));
	}
	
	public void testAvionQueNoColisiona()
	{
		posicionInicial = new Posicion(6,2);
		Posicion trayect = new Posicion (3,3);
		avionQueNoColisiona = new AvionChico(posicionInicial, trayect, vel);
		
		assertFalse (pistaChica.colisionoCon(avionQueNoColisiona));
	}
	
}
