
public abstract class Aeronave implements colisionable
{
	
	protected Posicion posicionActual;
	protected double velocidad;
	protected TamanioAeronave tamanio;
	protected TrayectoriaRecta trayectoria;
	
	public Aeronave()
	{
		posicionActual = new Posicion();
		tamanio = new TamanioAeronave();
	}
	
	/* ademas de cambiar su camino ya hace un primer avanze*/
	public void actualizarPosicion(Posicion posicionFinal)
	{
		trayectoria = new TrayectoriaRecta(posicionActual,posicionFinal);
		posicionActual = trayectoria.avanzar(velocidad);
	}
	
	public void actualizar()
	{
		this.trayectoria.avanzar(velocidad);
	}
	
	/* el if es una comparacion de un integer con un double (no es problema pero lo aclaro)*/
	public boolean colisionoCon(Aeronave unAvion)
	{
		double distancia=this.posicionActual.distanciaCon(unAvion.getPosicion());
		int	espacioOcupado=(this.tamanio.getTamanio()+unAvion.getTamanio().getTamanio());
		if ((distancia-espacioOcupado)<=0)
		{
			return true;
		}
		return false;
	}
	
	//Getters=============
	public Posicion getPosicion()
	{	return posicionActual; }
	
	public TamanioAeronave getTamanio()
	{	return tamanio; }
	
	public TrayectoriaRecta getTrayectoria()
	{	return trayectoria; }
	
	
	 
}
