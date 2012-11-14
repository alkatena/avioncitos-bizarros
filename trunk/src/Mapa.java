import java.util.ArrayList;


public class Mapa 
{
	
	private static Mapa map;
	private ArrayList<Aeronave> listaAviones = new ArrayList<Aeronave>();
	private ControlAereo controlA = new ControlAereo();
	private ControlTerrestre controlT = new ControlTerrestre();
	
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
	
	public void agregarPista(Pista pista)
	{
		controlT.agregarPista(pista);
	}
	
	
	public void actualizar()
	{
		controlA.actualizar();
		controlT.actualizar();
	}
	
	//Getters===========================
	
	public ArrayList<Aeronave> devolverAviones()
	{	return listaAviones;	}
	
	
}
	
	
	

