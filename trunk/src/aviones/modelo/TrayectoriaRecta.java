package aviones.modelo;

public class TrayectoriaRecta 
{
	private Posicion ptoInicial;
	private Direccion direccion;
	private Posicion posActual;
	private double amplificacion;
	
	public TrayectoriaRecta(Posicion pInicial, Posicion pFinal)
	{
		ptoInicial = pInicial;
		posActual = pInicial;
		direccion = this.generarDireccion(pInicial, pFinal);	
		amplificacion=0;
	}
	
	private Direccion generarDireccion(Posicion pInicial, Posicion pFinal)
	{
		return new Direccion(pFinal.restar(pInicial));
	}
	
	public void avanzar(double velocidad)
	{
		this.amplificacion=this.amplificacion+velocidad;
		posActual = direccion.getVector().multiplicarPorEscalar(this.amplificacion).sumar(ptoInicial);
	}
	
	public Direccion getDireccion()
	{
		return direccion;
	}
	
	public Posicion getPtoInicial() // o tmb suele llamarse pto de paso.
	{
		return ptoInicial;
	}

	public Posicion getPosActual()
	{
		return posActual;
	}
}
