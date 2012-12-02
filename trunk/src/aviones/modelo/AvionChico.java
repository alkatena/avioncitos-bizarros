package aviones.modelo;

import aviones.vista.VistaAvionChicoConDireccion;

public class AvionChico extends Aeronave 
	{
		public AvionChico(Posicion inicio, Posicion fin, double velocidad)
		{
			super (inicio, fin, velocidad);
			tamanio = TamanioAeronave.mediano();
			anchoImagen = 60; altoImagen = 60;
		}
		
		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarAvionChico();
		}
		
		protected void asignarVista()
		{
			vistaAvion = new VistaAvionChicoConDireccion(this);
		}
	
	}