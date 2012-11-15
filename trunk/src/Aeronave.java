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
		Posicion posInicialDefault = new Posicion(max, gen.nextInt(max));
		Posicion posFinalDefault = new Posicion(gen.nextInt(max), gen.nextInt(max));
		
		
		
		trayectoria = new TrayectoriaRecta(posInicialDefault, posFinalDefault);
		tamanio = new TamanioAeronave();
	}
	
	public void actualizarTrayectoria(Posicion posicionFinal)
	{
		trayectoria = new TrayectoriaRecta(this.getPosicion(),posicionFinal);
	}
	
	public void actualizar()
	{
		this.trayectoria.avanzar(velocidad);
	}
	
	/* el if es una comparacion de un integer con un double (no es problema pero lo aclaro)*/
	public boolean colisionoCon(Aeronave unAvion)
	{
		double distancia=this.getPosicion().distanciaCon(unAvion.getPosicion());
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
	
	public void setPosicion(Posicion unaPosicion) //Para las pruebas
	{	this.trayectoria.setPosActual(unaPosicion);}
	
	
	 
}
