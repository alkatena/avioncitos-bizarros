package aviones.vista;

import aviones.modelo.AvionChico;

public class VistaAvionChicoConDireccion extends VistasAeronavesDireccionadas
{
    public VistaAvionChicoConDireccion(AvionChico unAvion)
    {
        super(unAvion);
        vistaArriba.setNombreArchivoImagen("/imagenes/ValkyArriba.png");
        vistaAbajo.setNombreArchivoImagen("/imagenes/ValkyAbajo.png");
        vistaDerecha.setNombreArchivoImagen("/imagenes/ValkyDerecha.png");
        vistaIzquierda.setNombreArchivoImagen("/imagenes/ValkyIzquierda.png");
        vistaArribaIzquierda.setNombreArchivoImagen("/imagenes/ValkyIzquierdaArriba.png");
        vistaArribaDerecha.setNombreArchivoImagen("/imagenes/ValkyArribaDerecha.png");
        vistaAbajoIzquierda.setNombreArchivoImagen("/imagenes/ValkyIzquierdaAbajo.png");
        vistaAbajoDerecha.setNombreArchivoImagen("/imagenes/ValkyAbajoDerecha.png");

    }
}
