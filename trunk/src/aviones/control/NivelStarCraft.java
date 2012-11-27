package aviones.control;

import aviones.modelo.DireccionPista;
import aviones.modelo.Helipuerto;
import aviones.modelo.Mapa;
import aviones.modelo.PistaGrande;
import aviones.modelo.Posicion;
import aviones.vista.VistaHelipuerto;
import aviones.vista.VistaMapa;
import aviones.vista.VistaPistaGrande;

public class NivelStarCraft extends Nivel
{
		protected void build()
		{
			//Pistas
			Helipuerto helipuerto = new Helipuerto(new Posicion(700,410));
			PistaGrande pistaGrande = new PistaGrande(new Posicion(300,500),new DireccionPista( new Posicion(10,2) ));
			
			Mapa.getMapa().agregarPista(pistaGrande);
			Mapa.getMapa().agregarPista(helipuerto);
			
			//Vistas
			VistaPistaGrande vistaPistaGrande = new VistaPistaGrande();
			vistaPistaGrande.setPosicionable(pistaGrande);
			VistaHelipuerto vistaHelipuerto = new VistaHelipuerto();
			vistaHelipuerto.setPosicionable(helipuerto);
			VistaMapa vistaMapa = new VistaMapa();
			vistaMapa.setPosicionable(Mapa.getMapa());
			
			ControlVistas.agregarDibujable(vistaMapa);
			ControlVistas.agregarDibujable(vistaHelipuerto);
			ControlVistas.agregarDibujable(vistaPistaGrande);
		}
}
