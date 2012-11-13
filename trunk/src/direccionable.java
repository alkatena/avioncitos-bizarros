
public abstract interface direccionable
{
	public boolean suDireccionEsCorrecta( Aeronave unAvion);	
}

/* la idea  seria que cada pista que tuviera determinada dirreccion tendria una logica
 * distinta. Igual no me cierra mucho, en un momento herede de esta interfaz, una con cada
 * direccion posible y cada pista deberia implementar una interfaz distinta, pero dado a que 
 * solo hay que cambiar el metodo me parecio al pedo. Igual repito esto de la interfaz (asi 
 * como la estoy plantiando me hace ruido)
 */


