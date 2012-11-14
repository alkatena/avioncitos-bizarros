
public class TrayectoriaRecta 
{
	private Posicion ptoInicial;
	private Posicion ptoFinal;
	private Posicion direccion;
	private Posicion posActual;
	private double amplificacion;
	
	public TrayectoriaRecta(Posicion pInicial, Posicion pFinal)
	{
		ptoInicial = pInicial;
		posActual = pInicial;
		ptoFinal = pFinal;
		direccion = this.generarDireccion(pInicial, pFinal);	
		amplificacion=0;
	}
	
	private Posicion generarDireccion(Posicion pInicial, Posicion pFinal)
	{
		return pFinal.restar(pInicial);
	}
	
	public void avanzar(double velocidad)
	{
		this.amplificacion=this.amplificacion+velocidad;
		posActual = direccion.multiplicarPorEscalar(this.amplificacion).sumar(ptoInicial);
	}
	
	public Posicion getDireccion()
	{
		return direccion;
	}
	
	public Posicion getPtoInicial() // o tmb suele llamarse pto de paso.
	{
		return ptoInicial;
	}

	public Posicion getPtoFinal() // se usa para el helicoptero
	{
		return ptoFinal;
	}
	
	public Posicion getPosActual()
	{
		return posActual;
	}
}
