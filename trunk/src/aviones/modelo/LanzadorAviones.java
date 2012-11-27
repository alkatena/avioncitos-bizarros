package aviones.modelo;

import java.util.ArrayList;
import java.util.Random;

import ar.uba.fi.algo3.titiritero.vista.Imagen;
import aviones.control.ControlVistas;
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
	
	public LanzadorAviones(int CantidadMaxAviones)
	{
		this.maxAviones = CantidadMaxAviones;
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
		  	//Randomeo reflexion.
		    int index = gen.nextInt(3);
		    
		    //Selecciono la aeronave randomeada.
		    Aeronave avion = null;
	        ArrayList<Class> reflexion = new ArrayList<Class>();
	        reflexion.add(AvionChico.class);
	        reflexion.add(AvionGrande.class);
	        reflexion.add(Helicoptero.class);
	        Class tipoAvion = reflexion.get(index); 			
	        	        
	        //Selecciono la vista de la aeronave randomeada.
	        Imagen vistaAvion = null;
	        ArrayList<Class> reflexionVista = new ArrayList<Class>();
	        reflexionVista.add(VistaAvionChico.class);
	        reflexionVista.add(VistaAvionGrande.class);
	        reflexionVista.add(VistaHelicoptero.class);
	        Class tipoVistaAvion = reflexionVista.get(index);

	        double[] velocidad= new double[] {0.1, 0.2, 0.3, 0.4, 0.5};
	       	        
	        try {
	            	avion = (Aeronave)tipoAvion.getConstructors()[0].newInstance(this.randomearPosLimiteSup(),this.randomearPosTablero(),velocidad[gen.nextInt(5)]);
	            	vistaAvion =(Imagen) tipoVistaAvion.newInstance();	        
	        	}
	        catch (Exception e)
	        	{
	            	throw new RuntimeException(e);
	        	}
	        Mapa.getMapa().agregarAvion(avion);
    		vistaAvion.setPosicionable(avion);
    		ControlVistas.agregarDibujable(vistaAvion);
	  }	  
}
		
