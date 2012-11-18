package aviones.modelo;

public class DireccionPista extends Direccion
{

	private double tolerancia;
	
	public DireccionPista(Posicion puntoFinal)
	{
		super(puntoFinal);
		tolerancia = 0.0;
	}
	
	public void setTolerancia (double unaTolerancia)
	{
		tolerancia = unaTolerancia;
	}
	
	// en grados
	public boolean estaAlineadaCon(Direccion unaDireccion)
	{
		
		if (this.diferenciaDeAngulos(unaDireccion) <= tolerancia)
		{
			return true;
		}
		return false;	
	}
}
