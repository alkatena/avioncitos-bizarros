package aviones.modelo;

import ar.uba.fi.algo3.titiritero.ControladorJuego;
import ar.uba.fi.algo3.titiritero.ObjetoVivo;

public class Refresher implements ObjetoVivo
{
	private ControlAereo controlAereo;
	private ControlTerrestre controlTerrestre;
	private LanzadorAviones lanzador;

	public Refresher(ControladorJuego control)
	{
		controlAereo = new ControlAereo();
		controlTerrestre = new ControlTerrestre();
		lanzador = new LanzadorAviones(5,control);
		
	}
	
	public void refresh()
	{
		lanzador.actualizar();
		controlAereo.actualizar();
		controlTerrestre.actualizar();

	}

	
	public void vivir()
	{
		this.refresh();
	}
}

