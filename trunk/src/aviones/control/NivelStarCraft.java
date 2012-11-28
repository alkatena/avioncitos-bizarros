package aviones.control;

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

public class NivelStarCraft extends Nivel
{
		protected void build()
		{
			//Pistas
			Helipuerto helipuerto = new Helipuerto(new Posicion(830,380));
			PistaGrande pistaGrande = new PistaGrande(new Posicion(450,100),new DireccionPista( new Posicion(1,-1) ));
			PistaChica pistaChica = new PistaChica(new Posicion(210,420),new DireccionPista( new Posicion(1,1) ));
			
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
		}
}
