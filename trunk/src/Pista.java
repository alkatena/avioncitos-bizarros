public abstract class Pista implements colisionable
{
	protected Posicion posicion;
	protected TamanioAeronave tamanioAdmitido;
	protected DireccionPista direccion;
	
	public Pista(Posicion pos, DireccionPista unaDireccion)
	{
		
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
}
