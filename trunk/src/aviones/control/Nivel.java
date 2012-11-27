package aviones.control;

public abstract class Nivel 
{
	public static boolean instanciable = true;
	
	public static void instanciar(Niveles nivel)
	{
		if (instanciable)
		{
			nivel.crear().build();
		}
		instanciable = false;
	}
	
	protected abstract void build();

}
