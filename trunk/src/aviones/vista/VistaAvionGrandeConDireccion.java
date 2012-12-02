package aviones.vista;

import aviones.modelo.AvionGrande;

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
		vistaAbajoDerecha.setNombreArchivoImagen("/imagenes/battlecrousierDownRight.png");
	}
}
