public class Helicoptero extends Aeronave 
	{
		public Helicoptero()
		{
			//Falta generar random las naves que se crean
			tamanio.mediano();
			velocidad = 0.6;
		}
		

		public void actualizar()
		{
			if (this.trayectoria.getPtoFinal().compararA(this.posicionActual))
			{
				//no deberia modificar nada.
			}			
			else { this.trayectoria.avanzar(velocidad); }	
		}
}