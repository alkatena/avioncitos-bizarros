package aviones.modelo;

import java.util.Queue;

public abstract class Aeronave implements colisionable
{
	protected double velocidad;
	protected TamanioAeronave tamanio;
	protected Recorrido recorrido;
	

	public Aeronave(Posicion inicio, Posicion fin)
	{
		recorrido = new Recorrido(inicio, fin);
	}
	
	public void actualizarRecorrido(Queue<Posicion> posiciones)
	{
		recorrido.setPosiciones(posiciones);
	}
	
	public void actualizar()
	{
		this.recorrido.avanzar(velocidad);
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
	
	/* public Recorrido getTrayectoria()
		{	return trayectoria; }
	*/
	
	public Direccion getDireccion()
	{	return recorrido.getDireccion();	}
	
	 
}
