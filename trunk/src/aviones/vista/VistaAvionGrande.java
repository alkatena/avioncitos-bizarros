package aviones.vista;

import java.awt.Color;

import ar.uba.fi.algo3.titiritero.vista.Imagen;
import ar.uba.fi.algo3.titiritero.vista.Circulo;
import ar.uba.fi.algo3.titiritero.Dibujable;

public class VistaAvionGrande extends  Circulo/*Imagen*/  {

	/*public VistaAvionGrande(){
		this.setNombreArchivoImagen("/imagenes/battlecrousier.jpg");
	}*/
	
	public VistaAvionGrande()
	{
	super(30);
	setColor(Color.RED);
	}
}
