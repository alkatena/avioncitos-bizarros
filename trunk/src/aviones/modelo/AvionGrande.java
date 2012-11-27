package aviones.modelo;

import aviones.vista.VistaAvionGrande;

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
		
		protected void asignarVista()
		{
			vistaAvion = new VistaAvionGrande();
		}
	
	}