package aviones.vista;

import ar.uba.fi.algo3.titiritero.SuperficieDeDibujo;
import ar.uba.fi.algo3.titiritero.vista.Imagen;

import aviones.modelo.AvionGrande;
import aviones.modelo.Posicion;



public class VistaAvionGrandeConDireccion extends Imagen
{	

	private VistaAvionGrandeArriba vistaArriba = new VistaAvionGrandeArriba();
	private VistaAvionGrandeAribaDerecha vistaArribaDerecha = new VistaAvionGrandeAribaDerecha();
	private VistaAvionGrandeArribaIzquierda vistaArribaIzquierda = new VistaAvionGrandeArribaIzquierda ();
	
	private VistaAvionGrandeAbajo vistaGrandeAbajo = new VistaAvionGrandeAbajo();
	private VistaAvionGrandeAbajoDerecha vistaGrande = new VistaAvionGrandeAbajoDerecha();
	private VistaAvionGrandeAbajoIzquierda vistaGrande = new VistaAvionGrandeAbajoIzquierda();
	
	private VistaAvionGrandeDerecha vistaDerecha = new VistaAvionGrandeDerecha();
	private VistaAvionGrandeIzquierda vistaIzquierda = new VistaAvionGrandeIzquierda();
	
	private AvionGrande avion;
	
	public VistaAvionGrandeConDireccion(AvionGrande unAvion)
	{
		avion = unAvion;
		
	}
	
	public void dibujar(SuperficieDeDibujo superficeDeDibujo)
	{
	/* logica mauri */
		
		
		
		
		
	/* logica mocha 
	Posicion comparador = avion.getProximaPosicion().restar(avion.getPosicion());
	
	if  (comparador.getY() >= 0) 
	{
		if (Math.abs(comparador.getX()) <  0.05)
		{
			vistaHaciaAbajo.dibujar(superficeDeDibujo);
		}
		else
		{
			if ( comparador.getX() > 0 )
			{
				vistaHaciaHD.dibujar(superficeDeDibujo); 
			}
			else { vistaHaciaHI.dibujar(superficeDeDibujo); }
		}
	}
	else
	{
		if ( Math.abs(comparador.getX()) < 0.05)
		{
			vistaHaciaArriba.dibujar(superficeDeDibujo);
		}
		else
		{
			if (comparador.getX() > 0)
			{
				vistaHaciaHD.dibujar(superficeDeDibujo);
			}
			else { vistaHaciaHI.dibujar(superficeDeDibujo); }
		}
			
	}*/

	}
	
}
