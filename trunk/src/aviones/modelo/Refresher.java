package aviones.modelo;

import ar.uba.fi.algo3.titiritero.ObjetoVivo;

public class Refresher implements ObjetoVivo
{
	private ControlAereo controlAereo;
	private ControlTerrestre controlTerrestre;

	public Refresher()
	{
		controlAereo = new ControlAereo();
		controlTerrestre = new ControlTerrestre();
		
	}
	
	public void refresh()
	{
		controlAereo.actualizar();
		controlTerrestre.actualizar();
	}

	
	public void vivir()
	{
		this.refresh();
	}
}

