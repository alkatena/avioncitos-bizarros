package aviones.modelo;
public class PistaChica extends PistaConDireccion
{
	public PistaChica(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioPista = TamanioAeronave.chico();
		this.direccion.setTolerancia(15);
		this.anchoImagen = 300;
		this.altoImagen = 150;
	}	
	
	public boolean puedeAterrizarnAvionChico()
	{	return true;	}
}
