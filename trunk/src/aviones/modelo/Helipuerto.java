package aviones.modelo;
public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos)
	{
		super(pos);
		tamanioPista = TamanioAeronave.mediano();
		this.anchoImagen = 90;
		this.altoImagen = 90;
	}	
	
	public boolean puedeAterrizarHelicoptero()
	{	return true; }
}
