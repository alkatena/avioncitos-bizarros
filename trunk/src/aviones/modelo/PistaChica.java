package aviones.modelo;
public class PistaChica extends PistaConDireccion
{

	public PistaChica(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = TamanioAeronave.chico();
		this.direccion.setTolerancia(15);
	}	
	
	public boolean puedeAterrizarnAvionChico()
	{	return true;	}
}
