package aviones.sonido;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class SoundSeleccionarAvion 
{
	public SoundSeleccionarAvion()
	{    }
	     
	public static synchronized void playMusic()
	{    
		new Thread(new Runnable() 
		{
     		public void run() {
				try
        		{
            	AdvancedPlayer player = new AdvancedPlayer(
                    	Sound.class.getResourceAsStream("/sonidos/sonidoSeleccionarAvion.mp3"));
            	player.play();
	    		}
				catch (Exception e)
				{
				System.out.println("Cannot find the file specified.");
	    		}
	    	}
	    }).start();         
	}


/*public static synchronized void playSound() {
    new Thread(new Runnable() { // the wrapper thread is unnecessary, unless it blocks on the Clip finishing, see comments
      public void run() {
        try {
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(Sound.class.getResourceAsStream("/sonidos/sonidoSeleccionarAvion.mp3"));
          clip.open(inputStream);
          clip.start(); 
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }
      }
    }).start();
  }
*/
}