
/* Deberiamos tener esta clase, porq la manera de verificar una colision entre aviones requiere
 * un tamaño cuantitativo. Pero las maneras de implementarla que se me ocurren son rre negras.
 */

public class TamanioAeronave {
	
	private static final int TAMANIO_GRANDE = 6;
	static final int TAMANIO_MEDIANO = 4;
	static final int TAMANIO_CHICO = 2;
	
	private int tamanio;
	public TamanioAeronave()
	{
		tamanio=0;
	}
	
	public void grande()
	{
		this.tamanio= TAMANIO_GRANDE; 
	}
	
	public void mediano()
	{
		this.tamanio= TAMANIO_MEDIANO;
	}
	
	public void chico()
	{
		this.tamanio= TAMANIO_CHICO;
	}
	
	public int getTamanio()
	{
		return this.tamanio;
	}

}
