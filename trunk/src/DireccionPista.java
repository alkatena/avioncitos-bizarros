
public class DireccionPista
{

	private Posicion direccion;
	private double tolerancia;
	
	public DireccionPista(Posicion unaDireccion, double unaTolerancia)
	{
		direccion= unaDireccion;
		tolerancia= unaTolerancia;
	}
	
	public boolean EsUnaDireccionValida(Posicion unaDireccion)
	{
	Posicion diferenciaDeDirecciones = new Posicion();
	diferenciaDeDirecciones =(this.direccion.restar(unaDireccion));
	if (diferenciaDeDirecciones.getX() <= tolerancia) 
		&& (diferenciaDeDirecciones.getY() <= tolerancia)
		{
		return true;
		}
	return false;	
	}
	
}
