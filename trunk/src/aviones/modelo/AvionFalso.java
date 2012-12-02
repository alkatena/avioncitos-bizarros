package aviones.modelo;

import aviones.vista.VistaHelicoptero;

public class AvionFalso extends Aeronave 
	{
		public AvionFalso(Posicion inicio)
		{
			super(inicio, inicio, 0);
			tamanio = TamanioAeronave.chico();
		}
		
		public boolean puedeAterrizarEn(Pista unaPista) 
		{ return false; }
		
		protected void asignarVista()
		{vistaAvion = new VistaHelicoptero();}
	}