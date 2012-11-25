package aviones.modelo;

import java.util.ArrayList;
import  ar.uba.fi.algo3.titiritero.Posicionable;

public class Mapa implements Posicionable
{
	
	private static Mapa map;
	public int limite = 800;
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
	
	public boolean estaDentroDeLimites(Posicion unaPos)
	{
		return unaPos.estaEntre(0,limite);
	}
	//Getters===========================
	
	public ArrayList<Aeronave> devolverAviones()
	{	return listaAviones;	}
	
	public ArrayList<Pista> devolverPistas()
	{	return listaPistas;		}
	
	// Por ser objeto Posicionable
	public int getX()
	{
		return 0 ;
	
	}
	public int getY()
	{
		return 0 ;
	
	}
	
	
}
	
	
	

