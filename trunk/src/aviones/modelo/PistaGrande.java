package aviones.modelo;
public class PistaGrande extends PistaConDireccion
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioPista = TamanioAeronave.mediano();
		this.direccion.setTolerancia(20);
		this.anchoImagen = 400;
		this.altoImagen = 210;
	}
	
	public boolean puedeAterrizarAvionGrande()
	{	return true;	}
}
