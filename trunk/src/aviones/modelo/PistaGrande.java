package aviones.modelo;
public class PistaGrande extends PistaConDireccion
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = TamanioAeronave.grande();
		this.direccion.setTolerancia(20);
	}
	
	public boolean puedeAterrizarAvionGrande()
	{	return true;	}
}
