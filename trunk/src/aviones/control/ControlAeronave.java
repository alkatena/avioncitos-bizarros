package aviones.control;

import ar.uba.fi.algo3.titiritero.MouseClickObservador;
import  ar.uba.fi.algo3.titiritero.audio.Elemento;
import aviones.modelo.Aeronave;
import aviones.modelo.Posicion;
import aviones.modelo.Radar;
import aviones.sonido.Sound;

import aviones.sonido.SoundSeleccionarAvion;
import aviones.sonido.SoundSetiarRecorridoAvion;
import aviones.sonido.SoundAgregarRecorridoAvion;

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
				primero = true;
				System.out.println("DEB04: Avion seleccionado");
				SoundSeleccionarAvion.playMusic();
			}
			else
			{	
				if(avionSeleccionado != null)
				{
					if (primero)
					{
					avionSeleccionado.cambiarRecorrido(pos);
					primero = false;
					System.out.println("DEB05: Recorrido cambiado");
					SoundSetiarRecorridoAvion.playMusic();
					}
					else
					{
					avionSeleccionado.agregarAlRecorrido(pos);
					System.out.println("DEB06: Recorrido agregado");
					SoundAgregarRecorridoAvion.playMusic();
					}
				}
			}
		}
}

