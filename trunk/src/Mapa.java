import java.util.ArrayList;


public class Mapa 
{
	
	private static Mapa map;
	private Radar radar = new Radar();
	private ArrayList<Aeronave> listaAviones = new ArrayList<Aeronave>();
	
	public static Mapa getMapa()
	{
		if(map == null)
			map = new Mapa();
		return map;
	}

	
	public void agregarAvion(Aeronave avion)
	{
		listaAviones.add(avion);
	}
	
	
	//Getters===========================
	public Radar getRadar()
	{	return radar;	}
	
	
	public ArrayList<Aeronave> devolverAviones()
	{	return listaAviones;	}
	
	
}
	
	
	

