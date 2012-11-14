public abstract class Pista implements colisionable
{
	protected Posicion posicion;
	protected TamanioAeronave tamanioAdmitido;
	protected DireccionPista direccion;
	
	public Pista(Posicion pos, DireccionPista unaDireccion)
	{
		posicion = pos;
		direccion = unaDireccion;
	}
	
	/*es casi el mismo codigo que para la Aeronave*/
	public boolean colisionoCon(Aeronave unAvion)
	{
		double distancia=this.posicion.distanciaCon(unAvion.getPosicion());
		int	espacioOcupado=(this.tamanioAdmitido.getTamanio()+unAvion.getTamanio().getTamanio());
		if ((distancia-espacioOcupado)<=0)
		{
			return true;
		}
		return false;	
	}
	
	public Posicion getPosicion()
	{ return posicion; }
	
	public int getTamanio()
	{
		return tamanioAdmitido.getTamanio();
	}
	
	public void aterrizar(Aeronave unAvion)
	{
		if (this.direccion.esUnaDireccionValida(unAvion.getTrayectoria().getDireccion()) )
		{
			/*
			 * Aca deberiamos matar al avion.
			 */
			
			//ARREGLAR; SUMA TAMAÑO!
			Score.getScore().sumarPuntaje(unAvion.getTamanio().getTamanio());
		}
	}
}
