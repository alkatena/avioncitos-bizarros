
public class Aeronave implements colisionable
{
	private Posicion posicion;
	private double velocidad;
	private TamanioAeronave tamanio;
	private TrayectoriaRecta trayectoria;
	
	public Aeronave()
	{
		//Falta generar random las naves que se crean
		posicion = new Posicion();
		tamanio = new TamanioAeronave();
		tamanio.grande();
		velocidad = 0.1;
	}
	
	public Posicion actualizar()
	{
		return posicion = trayectoria.avanzar(velocidad);
	}
	
	
	public boolean colisionoCon(Aeronave unAvion)
	{
		double distancia=this.posicion.distanciaCon(unAvion.getPosicion());
		int	espacioOcupado=(this.tamanio.getTamanio()+unAvion.getTamanio().getTamanio());
		if ((distancia-espacioOcupado)<=0)
		{
			return true;
		}
		return false;
	}
	
	//Getters=============
	public Posicion getPosicion()
	{	return posicion; }
	
	public TamanioAeronave getTamanio()
	{	return tamanio; }
	
	
	
	 
}
