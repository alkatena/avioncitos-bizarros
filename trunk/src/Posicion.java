
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
	

	public double getX()
	{
		return x;
	}
	public double getY()
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
	
	 /* Te da la distancia con otra posicion cualquiera, se usa para el colisionoCon*/
	public double distanciaCon(Posicion pos)
	{
	Posicion nuevapos=this.restar(pos);
	return (Math.sqrt(Math.pow(nuevapos.getX(),2)+ Math.pow(nuevapos.getY(),2)));
	}
	
	public double norma()
	{
		Posicion posicionCeroCero = new Posicion(0,0);
		return distanciaCon(posicionCeroCero);
	}
	public Posicion normalizar()
	{
		double norma = this.norma();
		Posicion nuevaPos = new Posicion(	(this.getX())/norma, (this.getY()/norma)	);
		return nuevaPos;
	}
	
	public double ProductoInternoCanonicoCon(Posicion pos)
	{
		return ((this.x*pos.getX())+(this.y*pos.getY()));
	}
	
	
}
	

