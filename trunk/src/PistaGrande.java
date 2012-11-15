public class PistaGrande extends PistaConDireccion
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.grande();
		this.direccion.setTolerancia(tamanioAdmitido.getTamanio());
	}	
}
