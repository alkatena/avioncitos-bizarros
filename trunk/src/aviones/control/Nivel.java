package aviones.control;

public abstract class Nivel 
{
	public static boolean instanciable = true;
	
	public final void construite()
	{
		if (instanciable)
			this.build();
		instanciable = false;
	}
	
	protected abstract void build();

}
