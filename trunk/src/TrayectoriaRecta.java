
public class TrayectoriaRecta 
{
	private Posicion ptoInicial;
	private Posicion direccion;
	private double amplificacion;
	
	public TrayectoriaRecta(Posicion pInicial, Posicion pFinal)
	{
		ptoInicial = pInicial;
		direccion = this.generarDireccion(pInicial, pFinal);	
		amplificacion=0;
	}
	
	private Posicion generarDireccion(Posicion pInicial, Posicion pFinal)
	{
		return pFinal.restar(pInicial);
	}
	
	public Posicion avanzar(double velocidad)
	{
		this.amplificacion=this.amplificacion+velocidad;
		return direccion.multiplicarPorEscalar(this.amplificacion).sumar(ptoInicial);
	}
	
	public Posicion getDireccion()
	{
		return direccion;
	}
	
	public Posicion getPtoInicial() // o tmb suele llamarse pto de paso.
	{
		return ptoInicial;
	}

}
