
public class DireccionPista
{

	private Posicion direccion;
	private double tolerancia;
	
	public DireccionPista(Posicion unaDireccion)
	{
		direccion = unaDireccion;
	}
	
	// Deberia setiarse la tolerancia antes de usar los objetos direccion
	public void setTolerancia (double unaTolerancia)
	{
		tolerancia = unaTolerancia;
	}
	
	public boolean esUnaDireccionValida(Posicion unaDireccion)
	{
		Posicion diferenciaDeDirecciones = new Posicion();
		diferenciaDeDirecciones =(this.direccion.restar(unaDireccion));
		if( (Math.abs(diferenciaDeDirecciones.getX()) <= tolerancia) && (Math.abs(diferenciaDeDirecciones.getY()) <= tolerancia) )
		{
			return true;
		}
		return false;	
	}
	
}
