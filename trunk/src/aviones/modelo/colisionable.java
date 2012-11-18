package aviones.modelo;

public interface colisionable 
{
	public boolean colisionoCon(Aeronave obj);
	public Posicion getPosicion();
}
