package aviones.modelo;
public class PistaGrande extends PistaConDireccion
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioPista = TamanioAeronave.mediano();
		this.direccion.setTolerancia(10);
		this.anchoImagen = 184; //0.46
		this.altoImagen = 245;   //1.17
	}
	
	public boolean puedeAterrizarAvionGrande()
	{	return true;	}
}
