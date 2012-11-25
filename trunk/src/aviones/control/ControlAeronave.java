package aviones.control;

import ar.uba.fi.algo3.titiritero.MouseClickObservador;
import aviones.modelo.Aeronave;
import aviones.modelo.Posicion;
import aviones.modelo.Radar;


public class ControlAeronave implements MouseClickObservador
{
	private Radar radar = new Radar();
	private Aeronave avionSeleccionado = null;
	boolean primero = true;

	public void MouseClick(int x, int y)
	{
		
		Posicion pos = new Posicion((double)x, (double)y);
		Aeronave avion = radar.obtenerAvion(pos);
		this.actualizar(avion, pos);
	}
	
	private void actualizar(Aeronave avion, Posicion pos)
	{
			if (avion != null)
			{
				avionSeleccionado = avion;
				System.out.println("SELECCIONE AVION");
				primero = true;
			}
			else
			{	
				if (avionSeleccionado != null)
				{
					if(primero)
					{
						avionSeleccionado.cambiarRecorrido(pos);
						primero = false;
						System.out.println("CAMBIE RECORRIDO");
					}
					else
						System.out.println("AGREGA RECORRIDO");
						avionSeleccionado.agregarAlRecorrido(pos);
				}
			}
	}
}
