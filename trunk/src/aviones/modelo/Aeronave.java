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
		return (int)this.getPosicion().getX();
	
	}
	public int getY()
	{
		return (int)this.getPosicion().getY();
	
	}
	// Por ser ObjetoVivo 
	public void vivir()
	{
		this.actualizar();
		System.out.print("posicion real:");
		System.out.println(this.getPosicion().getX());
		System.out.print("posicion castiada:");
		System.out.println((int)this.getPosicion().getX());
	}
	
	
}
