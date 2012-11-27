package aviones.modelo;

import aviones.vista.VistaHelicoptero;

public class Helicoptero extends Aeronave 
	{
		public Helicoptero(Posicion inicio, Posicion fin, double velocidad)
		{
			super (inicio, fin, velocidad);
			tamanio = TamanioAeronave.chico();
		}
		

		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarHelicoptero();
		}
	
		protected void asignarVista()
		{
			vistaAvion = new VistaHelicoptero();
		}
	
		public void actualizar()
		{
			if (! (this.recorrido.finalizado()) )
			{ 
				 this.recorrido.avanzar();
			}
		}
}