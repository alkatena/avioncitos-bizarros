package aviones.control;

import java.awt.Color;
import java.awt.Font;

import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.Dibujable;

import ar.uba.fi.algo3.titiritero.audio.Reproductor;
import ar.uba.fi.algo3.titiritero.vista.TextoEstatico;
import aviones.vista.VistaTextoFin;

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

	
	public static void comenzarJuego()
	{
		controlador.comenzarJuego();
	}
	
	public static void juegoPerdido()
	{
		// (?) es loco, porque se supone que lo agrega, pero no deberia llegar a ejecutar...o si?
		VistaTextoFin vistaTextoFin = new VistaTextoFin();
		TextoEstatico textoFin = new TextoEstatico(vistaTextoFin.getTexto(),Color.RED, new Font( "Italic",Font.PLAIN,50));
		textoFin.setPosicionable(vistaTextoFin);
		ControlVistas.agregarDibujable(textoFin);
		/*Deberia ir logica de guardar el nuevo score maximo, si es que se ha superado,
		 * para eso habria que tener desde el controlador un acceso a la vistaScoreMax para
		 * utilizar el metodo guardarScoreMax.
		 * Debido a la implementacion guardamos en el archivo cada vez que se rompe el record en el juego,
		 * lo cual si fuera distinta la implementacion, podria ir mostrandose en la pantalla 
		 * mientras se va superando y solo guardarlo al final*/
		controlador.detenerJuego();
	}
	
	public static boolean estaEnEjecucion()
	{
		return controlador.estaEnEjecucion();
	}
	
	public static Reproductor getReproductorDeAudio()
	{
		return controlador.getReproductorDeAudio();
	}
}
