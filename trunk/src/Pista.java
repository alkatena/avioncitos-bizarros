public abstract class Pista implements colisionable, direccionable
{
	protected Posicion posicion;
	protected TamanioAeronave tamanioAdmitido;
	
	public Pista(Posicion pos)
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
	
	/* Habria que redefinirlo para cada pista que tuviera una direccion distinta */
	public boolean suDireccionEsCorrecta(Aeronave unAvion)
	{
		return true;
	}
	
}
