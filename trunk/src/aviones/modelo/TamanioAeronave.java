package aviones.modelo;

public class TamanioAeronave {
	
	private static final int TAMANIO_GRANDE = 20;
	static final int TAMANIO_MEDIANO = 15;
	static final int TAMANIO_CHICO = 10;
	
	private int tamanio;
	
	private TamanioAeronave(int tam)
	{
		tamanio = tam;
	}
	
	public static TamanioAeronave grande()
	{
		return new TamanioAeronave(TAMANIO_GRANDE);
	}
	
	public static TamanioAeronave mediano()
	{
		return new TamanioAeronave(TAMANIO_MEDIANO);
	}
	
	public static TamanioAeronave chico()
	{
		return new TamanioAeronave(TAMANIO_CHICO);
	}
	
	public TamanioAeronave getTamanio()
	{
		return new TamanioAeronave(this.tamanio);
	}
	
	private int getTamanioInterno()
	{
		return tamanio;
	}
	
	public boolean seSuperponeCon(TamanioAeronave otroTamanio, Posicion mia, Posicion otraPosicion)
	{
		int espacioOcupado = tamanio + otroTamanio.getTamanioInterno();
		double distancia = mia.distanciaCon(otraPosicion);
		
		return ((distancia - espacioOcupado)<= 0);		
	}
	
	public boolean esIgualA(TamanioAeronave otroTamanio)
	{
		return (this.tamanio == otroTamanio.getTamanioInterno());
	}

}
