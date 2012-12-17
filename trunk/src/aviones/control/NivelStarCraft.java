package aviones.control;

import java.awt.Color;
import java.awt.Font;
import ar.uba.fi.algo3.titiritero.vista.TextoDinamico;

import aviones.modelo.DireccionPista;
import aviones.modelo.Helipuerto;
import aviones.modelo.Mapa;
import aviones.modelo.PistaGrande;
import aviones.modelo.PistaChica;
import aviones.modelo.Posicion;
import aviones.vista.VistaHelipuerto;
import aviones.vista.VistaMapa;
import aviones.vista.VistaPistaGrande;
import aviones.vista.VistaPistaChica;
import aviones.vista.VistaTextoScore;
import aviones.vista.VistaTextoScoreMax;


public class NivelStarCraft extends Nivel
{
		protected void build()
		{
			//Pistas
			Helipuerto helipuerto = new Helipuerto(new Posicion(830,380));
			PistaGrande pistaGrande = new PistaGrande(new Posicion(480,220),new DireccionPista( new Posicion(10,-10) ));
			PistaChica pistaChica = new PistaChica(new Posicion(310,450),new DireccionPista( new Posicion(10,10) ));
			
			Mapa.getMapa().agregarPista(helipuerto);
			Mapa.getMapa().agregarPista(pistaGrande);
			Mapa.getMapa().agregarPista(pistaChica);
			
			//Vistas
			VistaHelipuerto vistaHelipuerto = new VistaHelipuerto();
			vistaHelipuerto.setPosicionable(helipuerto);
			VistaPistaGrande vistaPistaGrande = new VistaPistaGrande();
			vistaPistaGrande.setPosicionable(pistaGrande);
			VistaPistaChica vistaPistaChica = new VistaPistaChica();
			vistaPistaChica.setPosicionable(pistaChica);
		
			VistaMapa vistaMapa = new VistaMapa();
			vistaMapa.setPosicionable(Mapa.getMapa());
			
			ControlVistas.agregarDibujable(vistaMapa);
			ControlVistas.agregarDibujable(vistaHelipuerto);
			ControlVistas.agregarDibujable(vistaPistaGrande);
			ControlVistas.agregarDibujable(vistaPistaChica);
	
			
			//Agrego los Scores correspondiente a las dimensiones del mapa
			
			VistaTextoScore vistaTextoScore = new VistaTextoScore();
			TextoDinamico textoScoreDin = new TextoDinamico(vistaTextoScore,Color.RED, new Font( "Italic",Font.PLAIN,25));
			textoScoreDin.setPosicionable(vistaTextoScore);
			ControlVistas.agregarDibujable(textoScoreDin);
			
			VistaTextoScoreMax vistaTextoScoreMax = new VistaTextoScoreMax();
			TextoDinamico textoDimScoreMax = new TextoDinamico(vistaTextoScoreMax,Color.RED, new Font( "Italic",Font.PLAIN,25));
			textoDimScoreMax.setPosicionable(vistaTextoScoreMax);
			ControlVistas.agregarDibujable(textoDimScoreMax);
			
		
		}
}
