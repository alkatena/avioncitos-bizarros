package aviones.modelo;
public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos) // �Qui�n fue el forro que le hab�a puesto direcci�n al helipuerto? xD
	{
		super(pos);
		tamanioAdmitido = TamanioAeronave.mediano();
	}	
	
	public boolean puedeAterrizarHelicoptero()
	{	return true;	}
}
