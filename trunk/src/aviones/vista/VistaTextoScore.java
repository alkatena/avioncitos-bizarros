package aviones.vista;


import aviones.modelo.Mapa;
import aviones.modelo.Score;

public class VistaTextoScore extends VistaTexto{
	
	private Score score = Score.getScore();
	
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
		return "SCORE: "+String.valueOf(score.devolverPuntaje());
	}

}
