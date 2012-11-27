package aviones.modelo;

import aviones.vista.VistaAvionChico;

public class AvionChico extends Aeronave 
	{
		public AvionChico(Posicion inicio, Posicion fin, double velocidad)
		{
			super (inicio, fin, velocidad);
			tamanio = TamanioAeronave.mediano();
		}
		
		public boolean puedeAterrizarEn(Pista unaPista)
		{
			return unaPista.puedeAterrizarAvionChico();
		}
		
		protected void asignarVista()
		{
			vistaAvion = new VistaAvionChico();
		}
	
	}