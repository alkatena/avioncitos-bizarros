package aviones.modelo;
public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos)
	{
		super(pos);
		tamanioPista = TamanioAeronave.mediano();
	}	
	
	public boolean puedeAterrizarHelicoptero()
	{	return true;	}
}
