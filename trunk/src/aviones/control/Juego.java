package aviones.control;

import java.util.LinkedList;
import java.util.Queue;
//extra
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
//titiritero
import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.vista.Ventana;
import ar.uba.fi.algo3.titiritero.vista.Panel;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.SuperficieDeDibujo;
import ar.uba.fi.algo3.titiritero.Dibujable;
// las nuestras
import aviones.modelo.AvionGrande;
import aviones.modelo.AvionChico;
import aviones.modelo.Helicoptero;
import aviones.modelo.Mapa;
import aviones.modelo.Posicion;
import aviones.vista.VistaMapa;
import aviones.vista.VistaAvionGrande;
import aviones.vista.VistaAvionChico;
import aviones.vista.VistaHelicoptero;


public class Juego {
	
	
	public static void main(String[] args)
	{
		//Creo Aviones
		Posicion posi = new Posicion(0,0);
		Posicion posf = new Posicion(700,800);
		AvionGrande avion = new AvionGrande(posi,posf,0.3);
	
		Posicion posi2 = new Posicion(0,0);
		Posicion posf2 = new Posicion(700,0);
		Helicoptero helicoptero = new Helicoptero(posi2,posf2,0.5);
		
		Posicion posi3 = new Posicion(0,0);
		Posicion posf3 = new Posicion(0,800);
		AvionChico avionChico = new AvionChico(posi3,posf3,1);
		

		Mapa map= Mapa.getMapa();
		map.agregarAvion(avion);
		map.agregarAvion(helicoptero);
		map.agregarAvion(avionChico);
		//Agrego las vistas
		VistaMapa vistaMapa = new VistaMapa();
		vistaMapa.setPosicionable(map);	
		VistaAvionGrande vistaAvion = new VistaAvionGrande();
		vistaAvion.setPosicionable(avion);	
		VistaHelicoptero vistaHelicoptero = new VistaHelicoptero();
		vistaHelicoptero.setPosicionable(helicoptero);
		VistaAvionChico vistaAvionChico = new VistaAvionChico();
		vistaAvionChico.setPosicionable(avionChico);
		
		/* Creo el control y el panel y al primero le agrego todos los elementos
		creados*/
		ControladorJuego control =new ControladorJuego(true);
		Panel panel = new Panel(1183,603);
		control.setSuperficieDeDibujo(panel);
	
		control.agregarObjetoVivo(avion);
		control.agregarObjetoVivo(helicoptero);
		control.agregarObjetoVivo(avionChico);
		
		control.agregarDibujable(vistaMapa);
		control.agregarDibujable(vistaAvion);
		control.agregarDibujable(vistaHelicoptero);
		control.agregarDibujable(vistaAvionChico);
		
		// (!) tiempo en el que espera para refreshiar
		control.setIntervaloSimulacion(20);
		// creo la ventana que contiene al panel y a su vez al control
		Ventana ventana = new Ventana(1190,620,control);
		ventana.setTitle("StarCraftTraffic");
		ventana.add(panel);
		ventana.setVisible(true);
		/*comienzo el juego ( notese que hay varios metodos comenzar juego,
		* recomiendo verlos en la implementacion de ControladorJuego)*/
		control.comenzarJuego();	
	}
	

}





