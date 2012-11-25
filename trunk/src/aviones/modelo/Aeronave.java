package aviones.modelo;

import java.util.Queue;

import  ar.uba.fi.algo3.titiritero.Posicionable;

public abstract class Aeronave implements colisionable, Posicionable
{	
	protected TamanioAeronave tamanio;
	protected Recorrido recorrido;
	

	public Aeronave(Posicion inicio, Posicion fin, double velocidad)
	{
		recorrido = new Recorrido(inicio, fin, velocidad);
	}
	
	public void cambiarRecorrido(Posicion posicion)
	{
		recorrido.setPosicion(posicion);
	}
	
	public void agregarAlRecorrido(Posicion posicion)
	{
		recorrido.agregarPosicion(posicion);
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
	
	// Por ser objeto Posicionable
	
	/*(!) el problema es que para dibujar, el titiritero usa int, el casteo
	 * se realiza rre mocho. Ejemplos;
	 * posReal=1.4 posCastiada=1
	 * posReal=1.9 posCastiada=1
	 * posReal=2.4 posCastiada=2
	 * 
	 * es decir, toma el primer numero, pero no pasa nada hasta ahora con 
	 * el mover de aviones. Hay que ver choques y demas.
	 * 
	 */
	public int getX()
	{
		double pos = this.getPosicion().getX();
		pos = (pos - tamanio.getTamanioInterno()*2);
		return (int)pos;
	
	}
	public int getY()
	{
		double pos = this.getPosicion().getY();
		pos = (pos - tamanio.getTamanioInterno()*2);
		return (int)pos;
	
	}
	
}
