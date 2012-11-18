package aviones.modelo;
public class AvionGrande extends Aeronave 
	{
		public AvionGrande(Posicion inicio, Posicion fin)
		{
			super (inicio, fin);
			tamanio = TamanioAeronave.grande();
			velocidad = 0.1;
		}
	
		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarAvionGrande();
		}
	
	}