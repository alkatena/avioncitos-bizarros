package aviones.modelo;
public abstract class Pista implements colisionable
{
	protected Posicion posicion;
	protected TamanioAeronave tamanioAdmitido;
	protected int AvionesAterrizados;
	
	public Pista(Posicion pos)
	{
		posicion = pos;
		AvionesAterrizados = 0;
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
	
	public void aterrizar(Aeronave unAvion) { }	// Asegurarse que sean aviones del tama�o permitido por la pista

	public int cantidadAvionesAterrizados() 
	{	return AvionesAterrizados;}
}
