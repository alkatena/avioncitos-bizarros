public class Aeronave 
{
	private Posicion posicion;
	private Posicion direccion;
	private TorreDeControl torre;
	
	public Aeronave()
	{
		//Inicializarlas random?
		posicion = new Posicion();
		direccion = new Posicion();
	}
	
	public TorreDeControl devolverTorre()
	{
		if(torre == null)
			torre = new TorreDeControl(this);
		return torre;
			
	}
	
	public void cambiarDireccion(Posicion unStep)
	{
		direccion = unStep;
	}
	
	public void actualizarPosicion()
	{
		posicion = posicion.sumar(direccion);
	}
	
	public Posicion devolverPosicion()
	{
		return posicion;
	}
	 
}
