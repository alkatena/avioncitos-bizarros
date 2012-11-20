package aviones.modelo;

import java.util.Queue;

public abstract class Aeronave implements colisionable
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
	
	public void setRecorrido(Queue<Posicion> colaPosiciones) { this.recorrido.setPosiciones(colaPosiciones); }
	
	 
}
