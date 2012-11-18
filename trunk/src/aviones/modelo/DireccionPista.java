package aviones.modelo;

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
	public double diferenciaDeAngulos (Posicion otraDireccion)
	{
		return Math.toDegrees(Math.acos(direccion.ProductoInternoCanonicoCon(otraDireccion)/(direccion.norma()*otraDireccion.norma())));
	}
	
	public boolean esUnaDireccionValida(Posicion unaDireccion)
	{
		
		if (this.diferenciaDeAngulos(unaDireccion) <= tolerancia)
		{
			return true;
		}
		return false;	
	}
	
}
