public class aeronave 
{
	private Posicion posicion;
	private Posicion direccion;
	
	public aeronave()
	{
		//Inicializarlas random?
		posicion = new Posicion();
		direccion = new Posicion();
	}
	
	public void cambiarDireccion(Posicion unStep)
	{
		direccion = unStep;
	}
	
	 public void actualizarPosicion()
	{
		posicion = posicion.sumar(direccion);
	}
}
