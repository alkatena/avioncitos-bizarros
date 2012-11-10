
public class Posicion
{
	private int x;
	private int y;
	public Posicion()
	{
		x = 0;
		y = 0;
	}
	public Posicion(int X, int Y)
	{
		this.x = X;
		this.y = Y;
	}
	
	
	private int getX()
	{
		return x;
	}
	private int getY()
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
}
