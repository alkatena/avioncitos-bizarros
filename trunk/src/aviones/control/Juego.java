package aviones.control;


//titiritero
import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.vista.Ventana;
import ar.uba.fi.algo3.titiritero.vista.Panel;

import aviones.modelo.LanzadorAviones;
// las nuestras
import aviones.modelo.Refresher;
import aviones.modelo.AvionGrande;
import aviones.modelo.AvionChico;
import aviones.modelo.Helicoptero;
import aviones.modelo.Mapa;
import aviones.modelo.Posicion;
import aviones.modelo.DireccionPista;
import aviones.modelo.Helipuerto;
import aviones.modelo.PistaGrande;


import aviones.vista.VistaMapa;
import aviones.vista.VistaAvionGrande;
import aviones.vista.VistaAvionChico;
import aviones.vista.VistaHelicoptero;
import aviones.vista.VistaHelipuerto;
import aviones.vista.VistaPistaGrande;

import ar.uba.fi.algo3.titiritero.vista.MouseClickController;
import aviones.control.ControlAeronave;

public class Juego {
	
	
	public static void main(String[] args)
	{
		//Creo Aviones
		/*
		Posicion posi = new Posicion(0,0);
		Posicion posf = new Posicion(700,0);
		AvionGrande avion = new AvionGrande(posi,posf,0.3);
	
		Posicion posi2 = new Posicion(700,200);
		Posicion posf2 = new Posicion(0,0);
		Helicoptero helicoptero = new Helicoptero(posi2,posf2,0.2);
		
		Posicion posi3 = new Posicion(0,600);
		Posicion posf3 = new Posicion(0,0);
		AvionChico avionChico = new AvionChico(posi3,posf3,0.1);
		avionChico.agregarAlRecorrido(new Posicion(700,500));
		avionChico.agregarAlRecorrido(new Posicion(1000,100));*/
		
		//Agrego Pistas
		Posicion posHeli = new Posicion(700,410);
		Helipuerto helipuerto = new Helipuerto(posHeli);
		Posicion posPistaGrande = new Posicion(300,500);
		//(!)
		Posicion direccion = new Posicion (10,2);
		DireccionPista direcPistaGrande = new DireccionPista(direccion);
		PistaGrande pistaGrande = new PistaGrande(posPistaGrande,direcPistaGrande);

		Mapa map= Mapa.getMapa();
		/*map.agregarAvion(avion);
		map.agregarAvion(helicoptero);
		map.agregarAvion(avionChico);*/
		map.agregarPista(pistaGrande);
		map.agregarPista(helipuerto);
		
		//Agrego las vistas
		VistaMapa vistaMapa = new VistaMapa();
		vistaMapa.setPosicionable(map);	

		/*VistaHelicoptero vistaHelicoptero = new VistaHelicoptero();
		vistaHelicoptero.setPosicionable(helicoptero);
		VistaAvionChico vistaAvionChico = new VistaAvionChico();
		vistaAvionChico.setPosicionable(avionChico);*/
		VistaHelipuerto vistaHelipuerto = new VistaHelipuerto();
		vistaHelipuerto.setPosicionable(helipuerto);
		VistaPistaGrande vistaPistaGrande = new VistaPistaGrande();
		vistaPistaGrande.setPosicionable(pistaGrande);
		
		
		/* Creo el control y el panel y al primero le agrego todos los elementos
		creados*/
		ControladorJuego control =new ControladorJuego(true);
		Panel panel = new Panel(800,800);
		control.setSuperficieDeDibujo(panel);
		
		/*control.agregarObjetoVivo(avion);
		control.agregarObjetoVivo(helicoptero);
		control.agregarObjetoVivo(avionChico);*/
		Refresher refresh = new Refresher(control);
		control.agregarObjetoVivo(refresh);
		
		control.agregarDibujable(vistaMapa);
		control.agregarDibujable(vistaHelipuerto);
		control.agregarDibujable(vistaPistaGrande);

		/*
		control.agregarDibujable(vistaHelicoptero);
		control.agregarDibujable(vistaAvionChico);
		*/
		
		// (!) tiempo en el que espera para refreshiar
		control.setIntervaloSimulacion(10);
		//agrego los observers o control de click de aviones al CONTROL
		ControlAeronave controlAeronave = new ControlAeronave();
		control.agregarMouseClickObservador(controlAeronave);
		// Asocio mouse al CONTROL y al panel
		MouseClickController controlMouse = new MouseClickController(control);
		panel.addMouseListener(controlMouse);
	
	
		
	
							
		// creo la ventana que contiene al panel y a su vez al control
		Ventana ventana = new Ventana(800,800,control);
		ventana.setTitle("StarCraftTraffic");
		ventana.add(panel);
		ventana.setVisible(true);
		/*comienzo el juego ( notese que hay varios metodos comenzar juego,
		* recomiendo verlos en la implementacion de ControladorJuego)*/
		control.comenzarJuego();	
	}
	

}





