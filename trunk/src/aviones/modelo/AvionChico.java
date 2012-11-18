package aviones.modelo;
public class AvionChico extends Aeronave 
	{
		public AvionChico(Posicion inicio, Posicion fin)
		{
			super (inicio, fin);
			tamanio = TamanioAeronave.chico();
			velocidad = 0.5;
		}
		
		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarAvionChico();
		}
	
	}