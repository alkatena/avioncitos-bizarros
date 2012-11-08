
public class Pista 
{
	private Posicion direccion;
	private Posicion posicion;
	//Habria que asociar cada pista a un tipo de aviones
	
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
		//fijarse si la aeronave puede aterrizar en esta pista y devolver boolean
		return true;
	}
}
