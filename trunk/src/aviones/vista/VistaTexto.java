package aviones.vista;


import ar.uba.fi.algo3.titiritero.Posicionable;
import ar.uba.fi.algo3.titiritero.vista.ObjetoDeTexto;

	public abstract class VistaTexto implements Posicionable, ObjetoDeTexto
	{
		
		public int getX()
		{
			return  0;
		}
		
		public int getY()
		{
			return 0;
		}
	
		public String getTexto()
		{
			return "";
		}
		
		
		
	}

	

