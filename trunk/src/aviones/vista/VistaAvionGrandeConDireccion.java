package aviones.vista;

import ar.uba.fi.algo3.titiritero.SuperficieDeDibujo;
import ar.uba.fi.algo3.titiritero.vista.Imagen;

import aviones.modelo.Aeronave;
import aviones.modelo.AvionGrande;
import aviones.modelo.Direccion;
import aviones.modelo.Posicion;



public class VistaAvionGrandeConDireccion extends VistasAeronavesDireccionadas
{	


	
	public VistaAvionGrandeConDireccion(AvionGrande unAvion)
	{
		super(unAvion);
		vistaArriba.setNombreArchivoImagen("/imagenes/battlecrousierUp.png");
		vistaAbajo.setNombreArchivoImagen("/imagenes/battlecrousierDown.png");
		vistaDerecha.setNombreArchivoImagen("/imagenes/battlecrousierRight.png");
		vistaIzquierda.setNombreArchivoImagen("/imagenes/battlecrousierLeft.png");
		vistaArribaIzquierda.setNombreArchivoImagen("/imagenes/battlecrousierUpLeft.png");
		vistaArribaDerecha.setNombreArchivoImagen("/imagenes/battlecrousierUpRight.png");
		vistaAbajoIzquierda.setNombreArchivoImagen("/imagenes/battlecrousierDownLeft.png");
		vistaArribaDerecha.setNombreArchivoImagen("/imagenes/battlecrousierDownRight.png");

	}
}
