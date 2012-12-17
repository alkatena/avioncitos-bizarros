package aviones.modelo;

import java.util.ArrayList;
import java.util.Random;

import aviones.control.ControlVistas;


public class LanzadorAviones
{
	private int max = Mapa.getMapa().getLimiteHor();
    private int maxV = Mapa.getMapa().getLimiteVer();
	private Random gen = new Random();
	private int maxAviones;
	private int ciclosDeEspera = 400;
	private Radar radar = new Radar();
	private int contador = 0;
    private boolean arriba;
	
	public LanzadorAviones(int CantidadMaxAviones)
	{
		this.maxAviones = CantidadMaxAviones;
        arriba = true;
	}
	
	private Posicion randomearPosLimiteSup()
	{
        Posicion pos;
        if (arriba)
		    pos = new Posicion(gen.nextInt(max),0);
        else
            pos = new Posicion(gen.nextInt(max),maxV);
        arriba = !arriba;
		return pos;
	}
	
	private Posicion randomearPosTablero()
	{
		return new Posicion(gen.nextInt(max+10), gen.nextInt(maxV+10));
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
		    Aeronave avion;
	        ArrayList<Class<?>> reflexion = new ArrayList<Class<?>>();
	        reflexion.add(AvionChico.class);
	        reflexion.add(AvionGrande.class);
	        reflexion.add(Helicoptero.class);
	        Class<?> tipoAvion = reflexion.get(index); 			
	        	        
	        double[] velocidad= new double[] {0.3, 0.4, 0.5, 0.6, 0.7};
	       	        
	        try {
	            	avion = (Aeronave)tipoAvion.getConstructors()[0].newInstance(this.randomearPosLimiteSup(),this.randomearPosTablero(),velocidad[gen.nextInt(5)]);
	        	}
	        catch (Exception e)
	        	{
	            	throw new RuntimeException(e);
	        	}
	        Mapa.getMapa().agregarAvion(avion);
    		ControlVistas.agregarDibujable(avion.getVista());
	  }	  
}
		
