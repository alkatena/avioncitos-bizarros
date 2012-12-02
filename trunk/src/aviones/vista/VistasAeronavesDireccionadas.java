package aviones.vista;

import ar.uba.fi.algo3.titiritero.SuperficieDeDibujo;
import ar.uba.fi.algo3.titiritero.vista.Imagen;
import aviones.modelo.Aeronave;
import aviones.modelo.Direccion;
import aviones.modelo.Posicion;

public abstract class VistasAeronavesDireccionadas extends Imagen  {

	 protected Imagen vistaArriba = new Imagen();
	 protected Imagen vistaArribaDerecha = new Imagen();
	 protected Imagen vistaArribaIzquierda = new Imagen ();
	 
	 protected Imagen vistaAbajo = new Imagen();
	 protected Imagen vistaAbajoDerecha = new Imagen();
	 protected Imagen vistaAbajoIzquierda = new Imagen();
	 
	 protected Imagen vistaDerecha = new Imagen();
	 protected Imagen vistaIzquierda = new Imagen();

	 protected Aeronave avion;
		
		public VistasAeronavesDireccionadas(Aeronave unAvion)
		{
			avion = unAvion;
			vistaArriba.setPosicionable(unAvion);
			vistaArribaDerecha.setPosicionable(unAvion);
			vistaArribaIzquierda.setPosicionable(unAvion);
			vistaAbajo.setPosicionable(unAvion);
			vistaAbajoDerecha.setPosicionable(unAvion);
			vistaAbajoIzquierda.setPosicionable(unAvion);
			vistaDerecha.setPosicionable(unAvion);
			vistaIzquierda.setPosicionable(unAvion);
			
		}
		
		public void dibujar(SuperficieDeDibujo superficeDeDibujo)
		{
			Posicion horizontal = new Posicion(1,0);
			Direccion direccionHorizontal = new Direccion(horizontal);
			double angulo = avion.getDireccion().diferenciaDeAngulos(direccionHorizontal);
			
			if (anguloPositivo())
			{
				asignarVistasSuperiores(angulo, superficeDeDibujo);
			} 
			else
			{
				asignarVistasInferiores(angulo, superficeDeDibujo);
			}

		}
		public boolean anguloPositivo()
		{
			return (	avion.getProximaPosicion().restar(avion.getPosicion()).getY() <= 0	);			
		}
		
		public void asignarVistasSuperiores(double angulo, SuperficieDeDibujo superficeDeDibujo)
		{
			if (angulo < 22.5) {	vistaDerecha.dibujar(superficeDeDibujo);	}
			if ((angulo > 22.5)	&&	(angulo < 67.5)) {	vistaArribaDerecha.dibujar(superficeDeDibujo);	}
			if ((angulo > 67.5)	&&	(angulo < 112.5)) {	vistaArriba.dibujar(superficeDeDibujo);	}
			if ((angulo > 112.5)	&&	(angulo < 157.5)) {	vistaArribaIzquierda.dibujar(superficeDeDibujo);	}
			if (angulo > 157.5) {	vistaIzquierda.dibujar(superficeDeDibujo);	}
			
		}
		
		public void asignarVistasInferiores(double angulo, SuperficieDeDibujo superficeDeDibujo)
		{
			if (angulo < 22.5) {	vistaDerecha.dibujar(superficeDeDibujo);	}
			if ((angulo > 22.5)	&&	(angulo < 67.5)) {	vistaAbajoDerecha.dibujar(superficeDeDibujo);	}
			if ((angulo > 67.5)	&&	(angulo < 112.5)) {	vistaAbajo.dibujar(superficeDeDibujo);	}
			if ((angulo > 112.5)	&&	(angulo < 157.5)) {	vistaAbajoIzquierda.dibujar(superficeDeDibujo);	}
			if (angulo > 157.5) {	vistaIzquierda.dibujar(superficeDeDibujo);	}
			
		}
		
	}
