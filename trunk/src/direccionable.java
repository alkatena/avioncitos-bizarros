
public abstract interface direccionable
{
	public boolean suDireccionEsCorrecta( Aeronave unAvion);	
}

/* la idea  seria que cada pista que tuviera determinada dirreccion tendria una logica
 * distinta para el metodo. Igual no me cierra mucho, en un momento herede de esta interfaz,
 * una con cada direccion posible y cada pista deberia implementar una interfaz distinta, 
 * pero dado que solo hay que cambiar el metodo me parecio al pedo. 
 * Igual repito esto de la interfaz (asi como la estoy plantiando me hace ruido)
 * Otra es hacer una clase, pero si bien te queda mas claro para ponerle a cada pista
 * un atributo direccion. Nose que le instancias realmente.
 */


