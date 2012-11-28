package aviones.modelo;

import ar.uba.fi.algo3.titiritero.Posicionable;

public class Score implements Posicionable
{
	private int puntaje = 0;
	private static Score score;
	
	private Score(){}
	
	public static Score getScore()
	{
		if(score == null)
			score = new Score();
		return score;
	}
	
	public void sumarPuntaje(int valor)
	{
		puntaje = puntaje + valor;
	}
	
	public int devolverPuntaje()
	{
		return puntaje;
	}
	
	// hardCore dimensiones mapa
	public int getX()
	{
		return  (Mapa.getMapa().getLimiteHor()-120);
	}
	
	public int getY()
	{
		return (Mapa.getMapa().getLimiteVer()-60);
	}
}
