public class AvionGrande extends Aeronave 
	{
		public AvionGrande()
		{
			//Falta generar random las naves que se crean
			posicionActual = new Posicion();
			tamanio = new TamanioAeronave();
			tamanio.grande();
			velocidad = 0.9;
		}
	
	}