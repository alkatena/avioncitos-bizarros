package aviones.modelo;
import java.util.ArrayList;
import java.util.Random;

import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;
import aviones.vista.VistaAvionGrande;

public class LanzadorAviones implements ObjetoVivo
{
	int max = Mapa.getMapa().getLimite();
	Random gen = new Random();
	int maxAviones;
	int ciclosDeEspera = 5;
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
	        ArrayList<Class> reflexion = new ArrayList<Class>();
	        reflexion.add(AvionChico.class);
	        reflexion.add(AvionGrande.class);
	        reflexion.add(Helicoptero.class);
	        Class tipoAvion = reflexion.get(gen.nextInt(3));
	        Aeronave avion = null;
	        try {
	             avion = (Aeronave)tipoAvion.getConstructors()[0].newInstance(this.randomearPosLimiteSup(),this.randomearPosTablero(),0.3);
	     		Mapa map= Mapa.getMapa();
	     		map.agregarAvion(avion);
	     		VistaAvionGrande vistaAvion = new VistaAvionGrande();
	    		vistaAvion.setPosicionable(avion);
	    		this.controlador.agregarDibujable(vistaAvion);
	        
	        } catch (Exception e)
	        {
	            throw new RuntimeException(e);
	        }
	        Mapa.getMapa().agregarAvion(avion);
	    }
	  
	  public void vivir() 
	  {
		  this.actualizar();
	  }
	  
}
		
