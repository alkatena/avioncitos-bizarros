package aviones.vista;

import aviones.modelo.AvionChico;

public class VistaAvionChicoConDireccion extends VistasAeronavesDireccionadas
{
    public VistaAvionChicoConDireccion(AvionChico unAvion)
    {
        super(unAvion);
        vistaArriba.setNombreArchivoImagen("/imagenes/ValkyArribaS.png");
        vistaAbajo.setNombreArchivoImagen("/imagenes/ValkyAbajoS.png");
        vistaDerecha.setNombreArchivoImagen("/imagenes/ValkyDerechaS.png");
        vistaIzquierda.setNombreArchivoImagen("/imagenes/ValkyIzquierdaS.png");
        vistaArribaIzquierda.setNombreArchivoImagen("/imagenes/ValkyIzquierdaArribaS.png");
        vistaArribaDerecha.setNombreArchivoImagen("/imagenes/ValkyArribaDerechaS.png");
        vistaAbajoIzquierda.setNombreArchivoImagen("/imagenes/ValkyIzquierdaAbajoS.png");
        vistaAbajoDerecha.setNombreArchivoImagen("/imagenes/ValkyAbajoDerechaS.png");

    }
}
