/* Mauri: vos que sos capo en herencia, porque me tira error?*/

public class PistaGrande extends Pista
{

	public PistaGrande(Posicion pos, DireccionPista unaDireccion)
	{
		posicion = pos;
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.grande();
		direccion = unaDireccion;
	}
	
	/* Kimo: no hay manera de tener el colisionoCon escrito una sola vez?*/
	public boolean colisionoCon(Aeronave obj) {
	
		return false;
	}
}
