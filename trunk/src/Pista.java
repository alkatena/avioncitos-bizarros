public class Pista implements colisionable
{
	private Posicion posicion;
	private TipoNave tipoAdmitido;
	
	public Pista(Posicion pos)
	{
		posicion = pos;
		tipoAdmitido = TipoNave.grande;
	}
	
	public boolean colisionoCon(Aeronave avion)
	{
		if (this.posicion == avion.getPosicion())
			return (avion.getTamanio() == tipoAdmitido);
		return false;		
	}
	
	public Posicion getPosicion()
	{ return posicion; }
	
}
