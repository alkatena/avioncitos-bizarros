public class Helicoptero extends Aeronave 
	{
		public Helicoptero()
		{
			//Falta generar random las naves que se crean
			tamanio.mediano();
			velocidad = 0.6;
		}
	
		public Posicion actualizarPosicion(Posicion posicionFinal)
		{
			if (posicionFinal!=posicionActual)
			{
				trayectoria = new TrayectoriaRecta(posicionActual,posicionFinal);
				return posicionActual = trayectoria.avanzar(velocidad);
			}
			
			return null;
		}
	}