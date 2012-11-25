package aviones.control;

import ar.uba.fi.algo3.titiritero.MouseClickObservador;
import aviones.modelo.Aeronave;
import aviones.modelo.Posicion;
import aviones.modelo.Radar;


public class ControlAeronave implements MouseClickObservador
{
	private Radar radar = new Radar();
	private Aeronave avionInterno;
	
	public void MouseClick(int x, int y)
	{
		
		Posicion pos = new Posicion((double)x, (double)y);
		Aeronave avion = radar.obtenerAvion(pos);
		this.actualizar(avion, pos);
	}
	
	private void actualizar(Aeronave avion, Posicion pos)
	{
		if (avion == null)
		{
			avionInterno.agregarAlRecorrido(pos);
		}
		else
		{
			avionInterno = avion;
			avionInterno.cambiarRecorrido(pos);
		}
	}
}
