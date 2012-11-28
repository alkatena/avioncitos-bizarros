package aviones.modelo;

import  ar.uba.fi.algo3.titiritero.Posicionable;
import aviones.control.ControlVistas;

public abstract class Pista implements colisionable, Posicionable
{
	protected Posicion posicion;
	protected TamanioAeronave tamanioPista = TamanioAeronave.mediano();
	protected int AvionesAterrizados;
	protected int anchoImagen, altoImagen;
	
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
		ControlVistas.removerDibujable(unAvion.getVista());
		Mapa.getMapa().eliminarAvion(unAvion);
		System.out.println("DEB02: Avion estacionado(Deleted)");
	}

	public int cantidadAvionesAterrizados() 
	{	return AvionesAterrizados;	}
	
	public int getX()
	{	
		
		return (int) ( this.getPosicion().getX() - (this.anchoImagen/2) );
	}
	
	public int getY()
	{
		return (int) ( this.getPosicion().getY() - (this.altoImagen/2) );
	}
	
}
