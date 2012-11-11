enum TipoNave
{
	grande, mediana, chica
}

public class Aeronave implements colisionable
{
	private Posicion posicion;
	private double velocidad;
	private TipoNave tipo;
	private TrayectoriaRecta trayectoria;
	
	public Aeronave()
	{
		//Falta generar random las naves que se crean
		posicion = new Posicion();
		tipo = TipoNave.grande;
		velocidad = 0.1;
	}
	
	public Posicion actualizar()
	{
		return posicion = trayectoria.avanzar(velocidad);
	}
	
	
	public boolean colisionoCon(Aeronave unAvion)
	{
		return (this.posicion == unAvion.getPosicion());
	}
	
	
	//Getters=============
	public Posicion getPosicion()
	{	return posicion; }
	
	public TipoNave getTamanio()
	{	return tipo; }
	
	
	
	 
}
