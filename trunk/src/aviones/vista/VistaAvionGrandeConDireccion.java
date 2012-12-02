package aviones.vista;

import aviones.modelo.AvionGrande;

public class VistaAvionGrandeConDireccion extends VistasAeronavesDireccionadas
{	


	
	public VistaAvionGrandeConDireccion(AvionGrande unAvion)
	{
		super(unAvion);
		vistaArriba.setNombreArchivoImagen("/imagenes/battlecrousierUpS.png");
		vistaAbajo.setNombreArchivoImagen("/imagenes/battlecrousierDownS.png");
		vistaDerecha.setNombreArchivoImagen("/imagenes/battlecrousierRightS.png");
		vistaIzquierda.setNombreArchivoImagen("/imagenes/battlecrousierLeftS.png");
		vistaArribaIzquierda.setNombreArchivoImagen("/imagenes/battlecrousierUpLeftS.png");
		vistaArribaDerecha.setNombreArchivoImagen("/imagenes/battlecrousierUpRightS.png");
		vistaAbajoIzquierda.setNombreArchivoImagen("/imagenes/battlecrousierDownLeftS.png");
		vistaAbajoDerecha.setNombreArchivoImagen("/imagenes/battlecrousierDownRightS.png");
	}
}
