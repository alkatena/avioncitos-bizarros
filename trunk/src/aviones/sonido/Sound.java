package aviones.sonido;

import java.io.FileInputStream;
import javazoom.jl.player.advanced.AdvancedPlayer;
	 
public class Sound  
{
	public Sound()
	{    }
	     
	
	public static void playMusic()
	{    
		try 
		{
			AdvancedPlayer player = new AdvancedPlayer(new
            FileInputStream("src/sonidos/bgmusic.mp3"));
			player.play();
	    }
		catch (Exception e)
		{
			System.out.println("Cannot find the file specified.");
	    }
	         
	}
}