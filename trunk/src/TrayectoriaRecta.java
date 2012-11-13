
public class TrayectoriaRecta 
{
	private Posicion ptoFinal;
	private Posicion ptoActual;
	private Posicion ptoInicial;
	
	public TrayectoriaRecta(Posicion pInicial, Posicion pFinal)
	{
		ptoFinal = pFinal;
		ptoInicial = pInicial;
		ptoActual = ptoInicial;
	}
	
	public Posicion avanzar(double velocidad)
	{
		return ptoActual = ptoActual.multiplicarPorEscalar(velocidad).sumar(ptoInicial);
	}

}
