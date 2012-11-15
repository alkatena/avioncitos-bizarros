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
	
	public void setUp() 
	{
			posicionPista = new Posicion(1,1);
			direccion = new Posicion(0,1);
			direccionPista = new DireccionPista(direccion);
			pistaChica = new PistaChica(posicionPista,direccionPista);
	}

	
	public void testAvionQueAterrizaBienConMismaDireccion()
	{
		avionQueAterriza = new AvionChico();
		posicionInicial = new Posicion(1,0.9);
		posicionFinal = new Posicion(1,1.1);
		avionQueAterriza.setPosicion(posicionInicial);
		
		avionQueAterriza.actualizarTrayectoria(posicionFinal);
		pistaChica.aterrizar(avionQueAterriza);
		otroAvionQueAterriza = avionQueAterriza;
		pistaChica.aterrizar(otroAvionQueAterriza);
				
		assertTrue (pistaChica.cantidadAvionesAterrizados() == 2);	
	}
	
	public void testAvionQueAterrizaBienConDireccionParecida()
	{
		avionQueAterriza = new AvionChico();
		posicionInicial = new Posicion(1,0.9);
		posicionFinal = new Posicion(1.1,1.5);
		
		avionQueAterriza.setPosicion(posicionInicial);		
		avionQueAterriza.actualizarTrayectoria(posicionFinal);
		pistaChica.aterrizar(avionQueAterriza);
		otroAvionQueAterriza = avionQueAterriza;
		pistaChica.aterrizar(otroAvionQueAterriza);
				
		assertTrue (pistaChica.cantidadAvionesAterrizados() == 2);	
	}
	
	public void testAvionQueNoAterrizaPorDireccionDistina()
	{
		avionQueNoAterriza = new AvionChico();
		posicionInicial = new Posicion(1,0.9);
		posicionFinal = new Posicion(3,0);
		
		avionQueNoAterriza.setPosicion(posicionInicial);
		avionQueNoAterriza.actualizarTrayectoria(posicionFinal);
		pistaChica.aterrizar(avionQueNoAterriza);
						
		assertTrue (pistaChica.cantidadAvionesAterrizados() == 0);
	}
	
	public void testAvionQueColisiona()
	{
		avionQueColisiona = new AvionChico();
		posicionInicial = new Posicion(1,0.9);
		avionQueColisiona.setPosicion(posicionInicial);
		
		assertTrue (pistaChica.colisionoCon(avionQueColisiona));
	}
	
	public void testAvionQueNoColisiona()
	{
		avionQueNoColisiona = new AvionChico();
		posicionInicial = new Posicion(6,2);
		avionQueNoColisiona.setPosicion(posicionInicial);
		
		assertFalse (pistaChica.colisionoCon(avionQueNoColisiona));
	}
	
}
