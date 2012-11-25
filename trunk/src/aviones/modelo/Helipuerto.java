package aviones.modelo;
public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos)
	{
		super(pos);
		tamanioAdmitido = TamanioAeronave.mediano();
	}	
	
	public boolean puedeAterrizarHelicoptero()
	{	return true;	}
}
