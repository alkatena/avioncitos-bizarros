package aviones.modelo;

public class Direccion
{
	protected Posicion vectorInterno;
	
	public Direccion(Posicion puntoFinal)
	{
		vectorInterno = puntoFinal;
	}
	
	private Posicion getVector()
	{ return vectorInterno; }
	
	
	public double diferenciaDeAngulos (Direccion otraDireccion)
	{
		return Math.toDegrees(Math.acos(vectorInterno.ProductoInternoCanonicoCon(otraDireccion.getVector())/(vectorInterno.norma()*otraDireccion.getVector().norma())));
	}
	
	public Posicion generarStepParaVelocidad(double velocidad)
	{
		return vectorInterno.normalizar().multiplicarPorEscalar(velocidad);
	}
}
