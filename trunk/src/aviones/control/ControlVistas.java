package aviones.control;

import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.Dibujable;
import ar.uba.fi.algo3.titiritero.SuperficieDeDibujo;


public class ControlVistas 
{
	private static ControladorJuego controlador;
	private ControlVistas(){};
	
	public static void setControlador(ControladorJuego control)
	{
		controlador = control;
	}
	
	
	public static void removerDibujable(Dibujable dibujable)
	{	controlador.removerDibujable(dibujable);	}
	
	
	public static void agregarDibujable(Dibujable dibujable)
	{	controlador.agregarDibujable(dibujable);	}
	
	
	public static SuperficieDeDibujo getSuperficie()
	{	return controlador.getSuperficieDeDibujo();	}

}
