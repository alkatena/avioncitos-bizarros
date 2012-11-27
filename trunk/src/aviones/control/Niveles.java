package aviones.control;

public enum Niveles 
{
	Starcraft (new NivelStarCraft());
	
	
	private Nivel nivel;
	
	Niveles(Nivel level)
	{
		this.nivel = level;
	}
	
	Nivel crear()
	{
		return nivel;
	}
}
