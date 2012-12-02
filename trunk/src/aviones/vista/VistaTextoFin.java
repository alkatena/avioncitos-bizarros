package aviones.vista;

import aviones.control.ControlVistas;
import aviones.modelo.Mapa;



public class VistaTextoFin extends VistaTexto 
{
	public int getX()
	{
		//masomenos un 12%
		return  ((Mapa.getMapa().getLimiteHor()-((Mapa.getMapa().getLimiteHor()*88)/100))); 
	}
	
	public int getY()
	{
		//mitad del limiti vertical
		return (Mapa.getMapa().getLimiteVer()-((Mapa.getMapa().getLimiteVer())/2));
	}
	
	public String getTexto()
	{
		if (ControlVistas.estaEnEjecucion())
		{	
			return "¡PERDISTE EL JUEGO! NOOBSTER!";
		}
		else { return " ";}
	}

}