
public class Score 
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
}
