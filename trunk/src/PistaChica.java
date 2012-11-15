public class PistaChica extends PistaConDireccion
{

	public PistaChica(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.chico();
		this.direccion.setTolerancia(15);
	}	
}
