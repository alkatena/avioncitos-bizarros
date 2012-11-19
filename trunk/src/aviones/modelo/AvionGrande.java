package aviones.modelo;
public class AvionGrande extends Aeronave 
	{
		public AvionGrande(Posicion inicio, Posicion fin, double velocidad)
		{
			super (inicio, fin, velocidad);
			tamanio = TamanioAeronave.grande();
		}
	
		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarAvionGrande();
		}
	
	}