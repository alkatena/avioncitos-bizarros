package aviones.modelo;
public class PistaChica extends PistaConDireccion
{
	public PistaChica(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioPista = TamanioAeronave.mediano();
		this.direccion.setTolerancia(15);
		this.anchoImagen = 190;
		this.altoImagen = 100;
	}	
	
	public boolean puedeAterrizarnAvionChico()
	{	return true; }
}
