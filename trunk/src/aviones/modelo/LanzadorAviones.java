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
		ArrayList<String> reflexion = new ArrayList<String>();
		reflexion.add("AvionChico");
		reflexion.add("AvionGrande");
		reflexion.add("Helicoptero");
		String clase = reflexion.get(gen.nextInt(4));
		Class tipoAvion = Class.forName(clase);
		Aeronave avion = (Aeronave) tipoAvion.getConstructor(tipoavion.class).newInstance(this.randomearPosLimiteSup(),this.randomearPosTablero());
		Mapa.getMapa().agregarAvion(avion);
	}
		
}
		
