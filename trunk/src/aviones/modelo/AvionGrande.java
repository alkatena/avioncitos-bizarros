package aviones.modelo;

import aviones.vista.VistaAvionGrande;
import aviones.vista.VistaAvionGrandeAbajo;
import aviones.vista.VistaAvionGrandeAbajoDerecha;
import aviones.vista.VistaAvionGrandeAbajoIzquierda;
import aviones.vista.VistaAvionGrandeArriba;
import aviones.vista.VistaAvionGrandeArribaDerecha;
import aviones.vista.VistaAvionGrandeArribaIzquierda;
import aviones.vista.VistaAvionGrandeConDireccion;
import aviones.vista.VistaAvionGrandeDerecha;
import aviones.vista.VistaAvionGrandeIzquierda;

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