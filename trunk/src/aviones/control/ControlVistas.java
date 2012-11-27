package aviones.control;

import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.Dibujable;


public class ControlVistas 
{
	private static ControladorJuego controlador;
	private ControlVistas(){};
	
	public static void setControlador(ControladorJuego control)
	{
		controlador = control;
	}
	
	
	public static void removerDibujable(Dibujable dibujable)
	{	
		controlador.removerDibujable(dibujable);
		controlador.getSuperficieDeDibujo().limpiar();
	}
	
	
	public static void agregarDibujable(Dibujable dibujable)
	{	controlador.agregarDibujable(dibujable);	}

}
