public class TorreDeControl {

	private Aeronave avion;
	public TorreDeControl(Aeronave avion){
		this.avion = avion;
	}

	public Posicion posicionAvion(){
		return this.avion.devolverPosicion();
			
	}
	
	public void girarAvion (Posicion direccion){
		this.avion.cambiarDireccion(direccion);
	}

	public void comandarAvion(Posicion posicion){
		while (!alcanzoDestino(this.avion,posicion)){
			this.avion.actualizarPosicion(posicion);
		}
	}
	
	public boolean alcanzoDestino(Aeronave avion, Posicion posicion){
		return ((avion.devolverPosicion()).compararA(posicion));
	}
	
/*	public void asignarDestino(Posicion posicion){
		ArrayList<Posicion> trayectoria;
		Posicion direccion;
		Posicion posicionInterna = generarTrayectoria(this.avion,posicion);
		generarDireccionesInternas(trayectoria);
		while (!trayectoria.isEmpty()) {
			this.girarAvion(direccion);
			this.comandarAvion(posicionInterna);
		}
	}*/

}
