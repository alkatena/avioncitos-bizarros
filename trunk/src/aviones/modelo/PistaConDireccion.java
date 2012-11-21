package aviones.modelo;

public abstract class PistaConDireccion extends Pista {
	
	protected DireccionPista direccion;

	
	public PistaConDireccion(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos);
		direccion = unaDireccion;
	}
	
	public void aterrizar(Aeronave unAvion)
	{
		if (this.direccion.estaAlineadaCon(unAvion.getDireccion()))
		{
			super.aterrizar(unAvion);
		}
	}

}
