package aviones.modelo;

public class PistaGrande extends PistaConDireccion
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioPista = TamanioAeronave.mediano();
		this.direccion.setTolerancia(20);
		this.anchoImagen = 190;
		this.altoImagen = 320;
	}
	
	public boolean puedeAterrizarAvionGrande()
	{	return true;	}
	
	public boolean puedeAterrizarAvionChico()
	{	return true;	}
}
