package aviones.modelo;

import java.io.Serializable;

/* Las clases ScoreMax y Score podria compartir algo de comportamiento,
 * pero la paja me supera. Que Herede ScoreMax de Score estaria mal, ya que metodos
 * como sumarPuntaje no tienen sentido, por eso la necesidad de una super clase
 * madre de los dos.
 */

/* Lo hize singleton, para manterner similitud con Score, pero creo que podria no serlo
 * y tener que crearse en algun lado del constructor de vistaScoreMax, pero..
 * paja! =D tampoco es grave.
 */
public class ScoreMax implements Serializable
{
	private static final long serialVersionUID = 1L;
	int puntajeMax = 0;
	private static ScoreMax scoreMax;
	
	public static ScoreMax getScore()
	{
		if(scoreMax == null)
			scoreMax = new ScoreMax();
		return scoreMax;
	}
	
	public boolean esMayorElPuntaje(int puntaje)
	{
		if (puntajeMax < puntaje)
		{
			return true;
		}
		return false;
	}
	
	public void actualizarPuntaje(int puntaje)
	{
		if (puntajeMax < puntaje)
		{
			puntajeMax = puntaje;
		}
	}
	
	public int devolverPuntaje()
	{
		return puntajeMax;
	}
}
