enum tipoDeAeronave
	{
		AVIONGRANDE,AVIONCHICO,HELICOPTERO
	}

public class Pista 
{
	private Posicion direccion;
	private Posicion posicion;
	private tipoDeAeronave pistaDeAeronave;

	public Pista(Posicion dir, Posicion pos)
	{
		//Setear atributo de identificacion
		direccion = dir;
		posicion = pos;
	}
	
	public Posicion getPosicion()
	{
		return posicion;
	}
	
	public Posicion getDireccion()
	{
		return direccion;
	}
	
	public boolean puedeAterrizar(Aeronave avion)
	{
		return (avion.tipoDeAeronave()==this.pistaDeAeronave);
	}
}
