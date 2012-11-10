
public class TrayectoriaRecta {

	private Posicion direccion;
	private Posicion ptoDePaso;
	private Posicion ptoFinal;
	public TrayectoriaRecta()
	{
		direccion = new Posicion();
		ptoDePaso = new Posicion();
	}
	
	private void director(Posicion inicio, Posicion fin)
	{
		this.direccion=fin;
		this.direccion=this.direccion.restar(inicio);
	}
	
	public void setTrayectoria(Posicion inicio , Posicion fin)
	{
	this.director(inicio,fin);
	this.ptoDePaso=inicio;
	this.ptoFinal=fin;
	}
	
	private void avanzarEnLaTrayectoria(int velocidad)
	{
	this.ptoDePaso=this.ptoDePaso.multiplicarPorEscalar(velocidad);
	this.ptoDePaso=this.ptoDePaso.sumar(this.ptoFinal);
	}
	
	/* La idea es usar el metodo para setiar la nueva posicion de una aeronave
	segun la trayectoria */
	public Posicion avanzarObjetoVolador(int velocidad)
	{
		this.avanzarEnLaTrayectoria(velocidad);
		return this.ptoDePaso;
	}
	
}

