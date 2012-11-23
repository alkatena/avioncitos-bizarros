package aviones.control;
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
import aviones.modelo.Mapa;
import aviones.modelo.Posicion;
import aviones.vista.VistaMapa;
import aviones.vista.VistaAvionGrande;

public class Juego {
	
	
	public static void main(String[] args)
	{
		
		Posicion posi = new Posicion(200,100);
		Posicion posf = new Posicion(10,300);
		AvionGrande avion = new AvionGrande(posi,posf,10);
		Mapa map= Mapa.getMapa();
		map.agregarAvion(avion);
		VistaMapa vistaMapa = new VistaMapa();
		vistaMapa.setPosicionable(map);
		VistaAvionGrande vistaAvion = new VistaAvionGrande();
		vistaAvion.setPosicionable(avion);
		
		ControladorJuego control =new ControladorJuego(true);
		Panel panel = new Panel(500,500);
		control.setSuperficieDeDibujo(panel);
		control.agregarObjetoVivo(avion);
		control.agregarDibujable(vistaMapa);
		control.agregarDibujable(vistaAvion);
		control.setIntervaloSimulacion(50000);
		
		Ventana ventana = new Ventana(800,600,control);
		ventana.setTitle("StarCraftTraffic");
		ventana.add(panel);
		ventana.setVisible(true);
		
		control.comenzarJuegoAsyn();
		
	}
	

}





