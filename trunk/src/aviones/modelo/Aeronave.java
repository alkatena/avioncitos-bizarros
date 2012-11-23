package aviones.modelo;

import java.util.Queue;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import  ar.uba.fi.algo3.titiritero.Posicionable;

public abstract class Aeronave implements colisionable, Posicionable, ObjetoVivo
{
	protected TamanioAeronave tamanio;
	protected Recorrido recorrido;
	

	public Aeronave(Posicion inicio, Posicion fin, double velocidad)
	{
		recorrido = new Recorrido(inicio, fin, velocidad);
	}
	
	public void actualizarRecorrido(Queue<Posicion> posiciones)
	{
		recorrido.setPosiciones(posiciones);
	}
	
	public void actualizar()
	{
		this.recorrido.avanzar();
	}
	
	public boolean colisionoCon(Aeronave unAvion)
	{
		return (this.tamanio.seSuperponeCon(unAvion.getTamanio(), this.getPosicion(), unAvion.getPosicion()));
	}
	
	
	public abstract boolean puedeAterrizarEn(Pista unaPista);
	
	//Getters=============
	public Posicion getPosicion()
	{	return recorrido.getPosicion(); }
	
	public TamanioAeronave getTamanio()
	{	return tamanio; }
		
	public Direccion getDireccion()
	{	return recorrido.getDireccion();	}
	
	public void setRecorrido(Queue<Posicion> colaPosiciones) 
	{	this.recorrido.setPosiciones(colaPosiciones);	}
	
	// Por ser objeto Posicionable
	public int getX()
	{
		return 0 ;
	
	}
	public int getY()
	{
		return 0 ;
	
	}
	// Por ser ObjetoVivo 
	public void vivir()
	{
		
	}
	
	
}
