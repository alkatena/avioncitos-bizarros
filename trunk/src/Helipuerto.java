public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.mediano();
	}	
}
