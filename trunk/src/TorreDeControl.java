
public class TorreDeControl {

	private Aeronave avion;
	
	public TorreDeControl(Aeronave avion){
		this.avion = avion;
	}

	public Posicion posicionAvion(){
		return this.avion.devolverPosicion();
			
	}
	
	
}
