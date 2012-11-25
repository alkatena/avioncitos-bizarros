package aviones.modelo;
import java.util.ArrayList;
import java.util.Random;

public class LanzadorAviones 
{
	int max = Mapa.getMapa().getLimite();
	Random gen = new Random();
	int maxAviones;
	Radar radar = new Radar();
	int contador = 0;
	
	public LanzadorAviones(int CantidadMaxAviones)
	{
		maxAviones = CantidadMaxAviones;
	}
	
	private Posicion randomearPosLimiteSup()
	{
		Posicion pos = new Posicion(max, gen.nextInt(max));
		return pos;
	}
	
	private Posicion randomearPosTablero()
	{
		Posicion pos = new Posicion(gen.nextInt(max), gen.nextInt(max));
		return pos;
	}
	
	public void actualizar()
	{
		if (contador < maxAviones)
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
	        Class tipoAvion = reflexion.get(gen.nextInt(4));
	        Aeronave avion = null;
	        try {
	             avion = (Aeronave)tipoAvion.getConstructors()[0].newInstance(this.randomearPosLimiteSup(),this.randomearPosTablero());
	        } catch (Exception e)
	        {
	            throw new RuntimeException(e);
	        }
	        Mapa.getMapa().agregarAvion(avion);
	    }	
}
		
