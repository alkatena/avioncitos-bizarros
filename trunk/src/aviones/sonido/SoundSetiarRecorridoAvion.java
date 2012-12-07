package aviones.sonido;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class SoundSetiarRecorridoAvion
{
	public SoundSetiarRecorridoAvion()
	{    }
	
	public static synchronized void playMusic()
	{    
		new Thread(new Runnable() 
		{
     		public void run() {
				try
        		{
            	AdvancedPlayer player = new AdvancedPlayer(
                    	Sound.class.getResourceAsStream("/sonidos/sonidoSetiarRecorrido.mp3"));
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