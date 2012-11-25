package aviones.modelo;

import  ar.uba.fi.algo3.titiritero.Posicionable;

public abstract class Pista implements colisionable, Posicionable
{
	protected Posicion posicion;
	protected TamanioAeronave tamanioPista = TamanioAeronave.mediano();
	protected int AvionesAterrizados;
	
	public Pista(Posicion pos)
	{
		posicion = pos;
		AvionesAterrizados = 0;
	}
	
	public boolean colisionoCon(Aeronave unAvion)
	{
		return (this.tamanioPista.seSuperponeCon(unAvion.getTamanio(), this.posicion, unAvion.getPosicion()));
	}
		
	public boolean puedeAterrizarAvionChico()
	{	return false;	}
	
	public boolean puedeAterrizarAvionGrande()
	{	return false;	}
	
	public boolean puedeAterrizarHelicoptero()
	{	return false; }
	
	
	public Posicion getPosicion()
	{ return posicion; }
	
	public void aterrizar(Aeronave unAvion)
	{ 
		AvionesAterrizados++;
		Score.getScore().sumarPuntaje(1);
		Mapa.getMapa().eliminarAvion(unAvion);
		System.out.println("se estaciono");
	}

	public int cantidadAvionesAterrizados() 
	{	return AvionesAterrizados;	}
	
	public int getX()
	{
		double pos = this.getPosicion().getX();
		pos = (pos - tamanioPista.getTamanioInterno()*2);
		return (int)pos;
	
	}
	public int getY()
	{
		double pos = this.getPosicion().getY();
		pos = (pos - tamanioPista.getTamanioInterno()*2);
		return (int)pos;
	
	}
	
}
