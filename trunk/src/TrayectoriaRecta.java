
public class TrayectoriaRecta 
{
	private Posicion ptoInicial;
	private Posicion ptoFinal;
	private Posicion dirreccion;
	private double amplificacion;
	private Posicion ptoActual;
	
	public TrayectoriaRecta(Posicion pInicial, Posicion pFinal)
	{
		ptoInicial = pInicial;
		ptoFinal = pFinal;
		dirreccion = this.generarDireccion(pInicial, pFinal);	
		amplificacion=0;
		ptoActual = pInicial;
	}
	
	private Posicion generarDireccion(Posicion pInicial, Posicion pFinal)
	{
		return pFinal.restar(pInicial);
	}
	
	public Posicion avanzar(double velocidad)
	{
		this.amplificacion=this.amplificacion+velocidad;
		return ptoActual = dirreccion.multiplicarPorEscalar(this.amplificacion).sumar(ptoInicial);
	}
	
	public Posicion getPtoInicial()
	{
		return ptoInicial;
	}
	
	public Posicion getPtoFinal()
	{
		return ptoFinal;
	}


}
