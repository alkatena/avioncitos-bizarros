package aviones.control;

//titiritero
import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.vista.Ventana;
import ar.uba.fi.algo3.titiritero.vista.Panel;
import ar.uba.fi.algo3.titiritero.vista.MouseClickController;

// las nuestras
import aviones.modelo.Refresher;



public class Juego {
	
	
	public static void main(String[] args)
	{
		//========ControladorJuego=========
		ControladorJuego control = new ControladorJuego(true);
		control.setIntervaloSimulacion(10);
		ControlVistas.setControlador(control);
		
		//=======Refresher del modelo=======
		control.agregarObjetoVivo(new Refresher());
		
		//====Apartado visual: Panel y Ventana====
		Panel panel = new Panel(1100,580);
		control.setSuperficieDeDibujo(panel);
		Ventana ventana = new Ventana(1100,580,control);
		ventana.setTitle("StarCraftTraffic");
		ventana.add(panel);
		ventana.setVisible(true);

		//===========Observers==========
		control.agregarMouseClickObservador(new ControlAeronave());
		panel.addMouseListener(new MouseClickController(control));
		
		//=======Selecciono Nivel=======
		Nivel.instanciar(Niveles.Starcraft);
		
		//========ComienzoJuego=========
		control.comenzarJuegoAsyn();
	}
	

}





