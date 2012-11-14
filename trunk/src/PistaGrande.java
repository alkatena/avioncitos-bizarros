public class PistaGrande extends Pista
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.grande();
	}	
}
