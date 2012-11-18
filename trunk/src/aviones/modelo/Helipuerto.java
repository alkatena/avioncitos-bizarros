package aviones.modelo;
public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos);
		tamanioAdmitido = TamanioAeronave.mediano();
	}	
	
	public boolean puedeAterrizarHelicoptero()
	{	return true;	}
}
