package aviones.modelo;

public class TrayectoriaRecta 
{
	private Posicion ptoInicial;
	private Direccion direccion;
	private Posicion posActual;
	//private double amplificacion;
	private Posicion step;
	
	public TrayectoriaRecta(Posicion pInicial, Posicion pFinal, double velocidad)
	{
		ptoInicial = pInicial;
		posActual = pInicial;
		direccion = this.generarDireccion(pInicial, pFinal);	
		step = direccion.generarStepParaVelocidad(velocidad);
	}
	
	private Direccion generarDireccion(Posicion pInicial, Posicion pFinal)
	{
		return new Direccion(pFinal.restar(pInicial));
	}

	 
	 public void avanzar()
	 {
	  posActual = posActual.sumar(step);
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
