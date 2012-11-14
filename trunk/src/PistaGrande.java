public class PistaGrande extends Pista
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.grande();
	}
	
	/* Kimo: no hay manera de tener el colisionoCon escrito una sola vez?*/
	public boolean colisionoCon(Aeronave obj) {

		return false;
	}
}
