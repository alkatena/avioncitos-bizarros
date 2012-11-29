package aviones.modelo;

import aviones.vista.VistaAvionGrandeConDireccion;

public class AvionGrande extends Aeronave 
	{
		public AvionGrande(Posicion inicio, Posicion fin, double velocidad)
		{
			super (inicio, fin, velocidad);
			tamanio = TamanioAeronave.grande();
			anchoImagen = 80; altoImagen = 80;
		}
	
		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarAvionGrande();
		}
		
		protected void asignarVista()
		{
			 vistaAvion = new VistaAvionGrandeConDireccion(this);
		}
	
		

		
	}