package aviones.modelo;
import java.util.ArrayList;
import java.util.Random;

import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import ar.uba.fi.algo3.titiritero.vista.Imagen;
import aviones.vista.VistaAvionChico;
import aviones.vista.VistaAvionGrande;
import aviones.vista.VistaHelicoptero;

public class LanzadorAviones
{
	int max = Mapa.getMapa().getLimite();
	Random gen = new Random();
	int maxAviones;
	int ciclosDeEspera = 400;
	Radar radar = new Radar();
	int contador = 0;
	ControladorJuego controlador;
	
	public LanzadorAviones(int CantidadMaxAviones, ControladorJuego control)
	{
		this.maxAviones = CantidadMaxAviones;
		this.controlador = control;
	}
	
	private Posicion randomearPosLimiteSup()
	{
		Posicion pos = new Posicion(gen.nextInt(max),0);
		return pos;
	}
	
	private Posicion randomearPosTablero()
	{
		Posicion pos = new Posicion(gen.nextInt(max), gen.nextInt(max));
		return pos;
	}
	
	public void actualizar()
	{
		if (contador < ciclosDeEspera)
			contador++;
		else
		{
			if (maxAviones > radar.obtenerAviones().size())
			{
				this.lanzarAvionRandom();
			}
			contador = 0;
		}
	}
	
	  private void lanzarAvionRandom()
	    {
		    int index = gen.nextInt(3);
	        ArrayList<Class> reflexion = new ArrayList<Class>();
	        reflexion.add(AvionChico.class);
	        reflexion.add(AvionGrande.class);
	        reflexion.add(Helicoptero.class);
	        Class tipoAvion = reflexion.get(index);
	        
	        ArrayList<Class> reflexionVista = new ArrayList<Class>();
	        reflexionVista.add(VistaAvionChico.class);
	        reflexionVista.add(VistaAvionGrande.class);
	        reflexionVista.add(VistaHelicoptero.class);
	        Class tipoVistaAvion = reflexionVista.get(index);
	        
	        double[] v= new double[] {0.1, 0.2, 0.3};
	       
	        
	        Aeronave avion = null;
	        Imagen vistaAvion = null;
	        try {
	            	avion = (Aeronave)tipoAvion.getConstructors()[0].newInstance(this.randomearPosLimiteSup(),this.randomearPosTablero(),v[index]);
	            	vistaAvion =(Imagen) tipoVistaAvion.newInstance();	        
	        	}
	        catch (Exception e)
	        	{
	            	throw new RuntimeException(e);
	        	}
	        Mapa.getMapa().agregarAvion(avion);
    		vistaAvion.setPosicionable(avion);
    		this.controlador.agregarDibujable(vistaAvion);
	    }	  
}
		
