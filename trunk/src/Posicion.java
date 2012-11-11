
public class Posicion
{
	private double x;
	private double y;
	public Posicion()
	{
		x = 0;
		y = 0;
	}
	public Posicion(double X, double Y)
	{
		this.x = X;
		this.y = Y;
	}
	
	
	private double getX()
	{
		return x;
	}
	private double getY()
	{
		return y;
	}
	
	public boolean compararA(Posicion otraPos)
	{
		if (otraPos.getX() == this.getX() )
			if (otraPos.getY() == this.getY() )
				return true;
		return false;
	}
	
	public Posicion sumar(Posicion otraPos)
	{
		Posicion nuevapos = new Posicion(this.getX()+ otraPos.getX(), this.getY()+ otraPos.getY());
		return nuevapos;
	}
	
	public Posicion restar(Posicion otraPos)
	{
		Posicion nuevapos = new Posicion(this.getX()- otraPos.getX(), this.getY()- otraPos.getY());
		return nuevapos;
	}
	
	public Posicion multiplicarPorEscalar (double escalar)
	{
		Posicion nuevapos= new Posicion(this.getX()*escalar, this.getY()*escalar);
		return nuevapos;
	}	
	
}
	

