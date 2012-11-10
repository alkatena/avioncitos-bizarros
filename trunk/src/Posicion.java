
public class Posicion
{
	private float x;
	private float y;
	public Posicion()
	{
		x = 0;
		y = 0;
	}
	public Posicion(float X, float Y)
	{
		this.x = X;
		this.y = Y;
	}
	
	
	private float getX()
	{
		return x;
	}
	private float getY()
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
	
	public Posicion multiplicarPorEscalar (int escalar)
	{
		Posicion nuevapos= new Posicion(this.getX()*escalar, this.getY()*escalar);
		return nuevapos;	
	}	
	
	}
	

