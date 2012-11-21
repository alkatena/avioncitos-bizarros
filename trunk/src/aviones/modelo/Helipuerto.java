package aviones.modelo;
public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos) // ¿Quién fue el forro que le había puesto dirección al helipuerto? xD
	{
		super(pos);
		tamanioAdmitido = TamanioAeronave.mediano();
	}	
	
	public boolean puedeAterrizarHelicoptero()
	{	return true;	}
}
