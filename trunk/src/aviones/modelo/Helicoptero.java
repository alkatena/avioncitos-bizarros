package aviones.modelo;
public class Helicoptero extends Aeronave 
	{
		public Helicoptero(Posicion inicio, Posicion fin)
		{
			super (inicio, fin);
			tamanio = TamanioAeronave.mediano();
			velocidad = 0.2;
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
			else { this.recorrido.avanzar(velocidad); }	
		}
}