import java.util.ArrayList;


public class Mapa 
{

	private ArrayList<TorreDeControl> listaTorres;
	private ArrayList<Pista> listaPistas;
	
	public ArrayList<TorreDeControl> getTorres()
	{
		return listaTorres;
	}
	
	public ArrayList<Pista> getPistas()
	{
		return listaPistas;
	}
	
	public void agregarAvion(Aeronave avion)
	{
		listaTorres.add(avion.devolverTorre());
	}
	
	public void agregarPista(Pista pista)
	{
		listaPistas.add(pista);
	}
}
