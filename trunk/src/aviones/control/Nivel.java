package aviones.control;

public abstract class Nivel 
{
	private static boolean instanciable = true;
	
	public final static void instanciar(Niveles nivel)
	{
		if (instanciable)
		{
			nivel.crear().build();
		}
		instanciable = false;
	}
	
	protected abstract void build();

}
