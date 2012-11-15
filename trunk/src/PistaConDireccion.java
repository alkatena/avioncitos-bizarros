
public abstract class PistaConDireccion extends Pista {
	
	protected DireccionPista direccion;

	
	public PistaConDireccion(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos);
		direccion = unaDireccion;
	}
	
	public void aterrizar(Aeronave unAvion)
	{
		if (this.direccion.esUnaDireccionValida( unAvion.getTrayectoria().getDireccion()) )
		{
			//ARREGLAR; SUMA TAMAÑO!
			AvionesAterrizados++;
			Score.getScore().sumarPuntaje(unAvion.getTamanio().getTamanio());
			Mapa.getMapa().eliminarAvion(unAvion);
			
		}
	}

}
