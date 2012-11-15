public class Helipuerto extends Pista
{

	public Helipuerto(Posicion pos, DireccionPista unaDireccion)
	{
		super(pos, unaDireccion);
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.mediano();
	}	
	
	public void aterrizar(Aeronave unAvion)
	{
		//ARREGLAR; SUMA TAMAÑO!
		Score.getScore().sumarPuntaje(unAvion.getTamanio().getTamanio());
		Mapa.getMapa().eliminarAvion(unAvion);
	}
}
