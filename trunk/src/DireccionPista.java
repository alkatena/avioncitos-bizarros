
public class DireccionPista
{

	private Posicion direccion;
	private double tolerancia;
	
	public DireccionPista(Posicion unaDireccion)
	{
		direccion = unaDireccion;
	}
	
	/* Deberia setiarse la tolerancia antes de usar los objetos direccion
	* rango en 0 y 20 (grados?)
	*/
	
	public void setTolerancia (double unaTolerancia)
	{
		tolerancia = unaTolerancia;
	}
	
	// en grados
	public double diferenciaDeAngulos (pos otraDireccion)
	{
		//aca deberia ir arco cosena!
		return direccion.ProductoInternoCanonicoCon(otraDireccion)/(direccion.norma*otraDireccion.norma)
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
