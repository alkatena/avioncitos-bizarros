import java.util.Random;

public abstract class Aeronave implements colisionable
{
	protected double velocidad;
	protected TamanioAeronave tamanio;
	protected TrayectoriaRecta trayectoria;
	
	public Aeronave()
	{
		int max = 1000; //El mapa deberia ir de 0 a max!
		
		//Situar aeronave en lugar random del mapa, con direccion random del mapa.
		Random gen = new Random();
		Posicion posInicialDefault = new Posicion(gen.nextInt(), gen.nextInt());
		Posicion posFinalDefault = new Posicion(gen.nextInt(max), gen.nextInt(max));
		
		
		
		trayectoria = new TrayectoriaRecta(posInicialDefault, posFinalDefault);
		tamanio = new TamanioAeronave();
	}
	
	/* ademas de cambiar su camino ya hace un primer avanze*/
	public void actualizarTrayectoria(Posicion posicionFinal)
	{
		trayectoria = new TrayectoriaRecta(trayectoria.getPosActual(),posicionFinal);
	}
	
	public void actualizar()
	{
		this.trayectoria.avanzar(velocidad);
	}
	
	/* el if es una comparacion de un integer con un double (no es problema pero lo aclaro)*/
	public boolean colisionoCon(Aeronave unAvion)
	{
		double distancia=trayectoria.getPosActual().distanciaCon(unAvion.getPosicion());
		int	espacioOcupado=(this.tamanio.getTamanio()+unAvion.getTamanio().getTamanio());
		if ((distancia-espacioOcupado)<=0)
		{
			return true;
		}
		return false;
	}
	
	//Getters=============
	public Posicion getPosicion()
	{	return trayectoria.getPosActual(); }
	
	public TamanioAeronave getTamanio()
	{	return tamanio; }
	
	public TrayectoriaRecta getTrayectoria()
	{	return trayectoria; }
	
	
	 
}
