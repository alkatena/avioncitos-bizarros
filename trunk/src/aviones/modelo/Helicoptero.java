package aviones.modelo;
public class Helicoptero extends Aeronave 
	{
		public Helicoptero(Posicion inicio, Posicion fin, double velocidad)
		{
			super (inicio, fin, velocidad);
			tamanio = TamanioAeronave.mediano();
		}
		

		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarHelicoptero();
		}
	
	
		public void actualizar()
		{
			if (this.recorrido.getPtoFinal() == null)
			{ /*no deberia modificar nada.*/
			}
			else { this.recorrido.avanzar(); }	
		}
}