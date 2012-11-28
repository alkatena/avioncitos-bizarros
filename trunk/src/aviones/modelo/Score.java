package aviones.modelo;

import ar.uba.fi.algo3.titiritero.Posicionable;
import ar.uba.fi.algo3.titiritero.vista.ObjetoDeTexto;

public class Score implements Posicionable, ObjetoDeTexto
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
		return  (Mapa.getMapa().getLimiteHor()-150);
	}
	
	public int getY()
	{
		return (Mapa.getMapa().getLimiteVer()-50);
	}
	
	public String getTexto()
	{
		return "SCORE: "+String.valueOf(this.devolverPuntaje());
	}
	
}
