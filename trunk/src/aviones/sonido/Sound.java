package aviones.sonido;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class Sound
{
	public Sound()
	{    }
	     
	
	public static void playMusic()
	{    
		try
        {
            AdvancedPlayer player = new AdvancedPlayer(
                    Sound.class.getResourceAsStream("/sonidos/bgmusic.mp3"));
            player.play();
	    }
		catch (Exception e)
		{
			System.out.println("Cannot find the file specified.");
	    }
	         
	}
}