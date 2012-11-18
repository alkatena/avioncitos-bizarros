package aviones.modelo;
import java.util.ArrayList;


public class Mapa 
{
	
	private static Mapa map;
	public int limite = 1000;
	private ArrayList<Aeronave> listaAviones = new ArrayList<Aeronave>();
	private ArrayList<Pista> listaPistas = new ArrayList<Pista>();
	
	
	private Mapa(){	}
	
	public static Mapa getMapa()
	{
		if(map == null)
			map = new Mapa();
		return map;
	}

	public int getLimite()
	{
		return limite;
	}
	
	public void eliminarAvion(Aeronave avion)
	{
		listaAviones.remove(avion);
	}
	
	public void agregarAvion(Aeronave avion)
	{
		listaAviones.add(avion);
	}
	
	public void agregarPista(Pista pista)
	{
		listaPistas.add(pista);
	}
	
	//Getters===========================
	
	public ArrayList<Aeronave> devolverAviones()
	{	return listaAviones;	}
	
	public ArrayList<Pista> devolverPistas()
	{	return listaPistas;		}
	
	
}
	
	
	

