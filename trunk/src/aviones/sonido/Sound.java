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
			AdvancedPlayer p = new AdvancedPlayer(new
			FileInputStream("/sonidos/prueba.mp3"));
			p.play();
	    }
		catch (Exception e)
		{
			System.out.println("Cannot find the file specified.");
	    }
	         
	}
}