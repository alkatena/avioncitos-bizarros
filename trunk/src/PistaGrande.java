/* Mauri: vos que sos capo en herencia, porque me tira error?*/

public class PistaGrande extends Pista
{

	public PistaGrande(Posicion pos)
	{
		posicion = pos;
		tamanioAdmitido = new TamanioAeronave();
		tamanioAdmitido.grande();
	}

	
	/* Kimo: no hay manera de tener el colisionoCon escrito una sola vez?*/
	public boolean colisionoCon(Aeronave obj) {
	
		return false;
	}
	
	
	/* ejemplo; que fuera solo horizontal hacia la derecha
	 * (tuve que hacer publicos los getters de posicion, =S pero no me queda otra necesito
	 * desglozar como avanza)
	 * Esto igual va a tener dramas porque horizontalmente nunca va a ser 0 exacto
	 * asique habria que poner un criterio como de tolerancia? (que la resta sea menor a un
	 * 0.005)
	 * */
	public boolean suDireccionEsCorrecta(Aeronave unAvion)
	{
		TrayectoriaRecta trayectoria = unAvion.getTrayectoria();
		double diferenciaEnX = (trayectoria.getPtoFinal().getX()-trayectoria.getPtoInicial().getX());
		double diferenciaEnY = (trayectoria.getPtoFinal().getY()-trayectoria.getPtoInicial().getY());
		// va hacia la derecha en x. mantiene y
		if (diferenciaEnX<0) && (diferenciaEnY=0)
		{
			return true;	
		}
		return false;
	}
}
