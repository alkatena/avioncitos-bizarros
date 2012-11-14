
public class Refresher 
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

}

