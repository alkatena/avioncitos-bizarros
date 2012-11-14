public class Helicoptero extends Aeronave 
	{
		public Helicoptero()
		{
			tamanio.mediano();
			velocidad = 0.6;
		}
		

		public void actualizar()
		{
			if (this.trayectoria.getPtoFinal().compararA(trayectoria.getPosActual()))
			{
				//no deberia modificar nada.
			}			
			else { this.trayectoria.avanzar(velocidad); }	
		}
}