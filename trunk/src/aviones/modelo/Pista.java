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
	
	public boolean colisionoCon(Aeronave unAvion)
	{
		return (this.tamanioAdmitido.seSuperponeCon(unAvion.getTamanio(), this.posicion, unAvion.getPosicion()));
	}
		
	public boolean puedeAterrizarAvionChico()
	{	return false;	}
	
	public boolean puedeAterrizarAvionGrande()
	{	return false;	}
	
	public boolean puedeAterrizarHelicoptero()
	{	return false; }
	
	
	public Posicion getPosicion()
	{ return posicion; }
	
	public TamanioAeronave getTamanio()
	{
		return tamanioAdmitido.getTamanio();
	}
	
	public void aterrizar(Aeronave unAvion)
	{ 
		AvionesAterrizados++;
		Score.getScore().sumarPuntaje(1);
		Mapa.getMapa().eliminarAvion(unAvion);
	}

	public int cantidadAvionesAterrizados() 
	{	return AvionesAterrizados;	}
}
