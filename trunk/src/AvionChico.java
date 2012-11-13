public class AvionChico extends Aeronave 
	{
		public AvionChico()
		{
			//Falta generar random las naves que se crean
			posicionActual = new Posicion();
			tamanio = new TamanioAeronave();
			tamanio.chico();
			velocidad = 0.3;
		}
	
	}