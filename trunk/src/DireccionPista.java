
public class DireccionPista
{

	private Posicion direccion;
	private double tolerancia;
	
	public DireccionPista(Posicion unaDireccion)
	{
		direccion = unaDireccion;
	}
	
	// Deberia setiarse la tolerancia antes de usar la clase direccion
	public void setTolerancia (double unaTolerancia)
	{
		tolerancia = unaTolerancia;
	}
	
	public boolean esUnaDireccionValida(Posicion unaDireccion)
	{
		Posicion diferenciaDeDirecciones = new Posicion();
		diferenciaDeDirecciones =(this.direccion.restar(unaDireccion));
		if( (diferenciaDeDirecciones.getX() <= tolerancia) && (diferenciaDeDirecciones.getY() <= tolerancia) )
		{
			return true;
		}
		return false;	
	}
	
}
