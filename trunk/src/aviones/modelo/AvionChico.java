package aviones.modelo;
public class AvionChico extends Aeronave 
	{
		public AvionChico(Posicion inicio, Posicion fin, double velocidad)
		{
			super (inicio, fin, velocidad);
			tamanio = TamanioAeronave.chico();
		}
		
		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarAvionChico();
		}
	
	}