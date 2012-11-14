public class PistaChica extends Pista
{

	public PistaChica(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.chico();
	}	
}
