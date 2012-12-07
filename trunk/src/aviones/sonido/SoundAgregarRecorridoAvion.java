package aviones.sonido;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class SoundAgregarRecorridoAvion
{
	public SoundAgregarRecorridoAvion()
	{    }
	
//Ahora SI! Aplica recurrencia, ohhh yeah! deberiamos tener una mejor jerarquia
/* de clases y no tener estas 3 con codigo repetido, pero bueno es solo para
 * tunear el juegito!
 * 
 * El problema era que copiando el playMusic comun, el juego se trababa,
 * reproducia y seguia. Nose por que, porque la musica del juego no produce
 * ese error, pero como estos sonidos se llaman en medio de la logica del juego
 * habra alguna razon logica. ( pensar ? cierta idea creo que tengo el porque..)
 */
	public static synchronized void playMusic()
	{    
		new Thread(new Runnable() 
		{
     		public void run() {
				try
        		{
            	AdvancedPlayer player = new AdvancedPlayer(
                    	Sound.class.getResourceAsStream("/sonidos/sonidoAgregarRecorrido.mp3"));
            	player.play();
	    		}
				catch (Exception e)
				{
				System.out.println("Cannot find the file specified.");
	    		}
	    	}
	    }).start();         
	}
}