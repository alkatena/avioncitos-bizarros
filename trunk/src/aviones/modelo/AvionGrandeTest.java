package aviones.modelo;
import java.util.LinkedList;
import java.util.Queue;

import junit.framework.TestCase;



public class AvionGrandeTest extends TestCase {

	AvionGrande boeing777;
	AvionGrande aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion pFinal1;
	Posicion pFinal2;
	Posicion pIntermedia;
	Posicion otraPInicial;
	Posicion pInicialColision;
	Posicion trayect;
	Posicion pArbitraria;
	double vel = 0.5;
	
	public void setUp() 
	{

			pInicialColision = new Posicion(1,6);
			otraPInicial = new Posicion(9,9);
			trayect = new Posicion (4,0);
			

			aeronaveChocadora = new AvionGrande(pInicialColision, trayect, vel);
			aeronaveNoChocadora = new AvionChico(otraPInicial, trayect, vel);
	}

	
	public void testactualizarPosicionVarias()
	{
		pInicial = new Posicion(0,0);
		pIntermedia = new Posicion(0,50); // Hace que el avión se mueva en la dirección (0,1)
		pFinal1 = new Posicion(1,1);
		pFinal2 = new Posicion(1,2);
		pArbitraria = new Posicion(1,2);
		
		Queue<Posicion> posiciones = new LinkedList<Posicion>();
		posiciones.add(pFinal1);
		posiciones.add(pFinal2);
		
		boeing777 = new AvionGrande(pInicial, pIntermedia, 1);
		boeing777.actualizar(); // El avión se movió hacia la (0,1)
		boeing777.setRecorrido(posiciones); // "Hago clic" en las posición (1,1) y luego en la (1,2)
		boeing777.actualizar(); 
		boeing777.actualizar(); 
			
		
		assertTrue (boeing777.getPosicion().compararA(pArbitraria));
	}  
	
	public void testactualizarPosicionAvionQueSigue()
	{
		pInicial = new Posicion(0,0);
		pIntermedia = new Posicion(0,50); // Hace que el avión se mueva en la dirección (0,1)
		pFinal1 = new Posicion(1,1);
		pFinal2 = new Posicion(1,2);
		pArbitraria = new Posicion(1,6);
		
		Queue<Posicion> posiciones = new LinkedList<Posicion>();
		posiciones.add(pFinal1);
		posiciones.add(pFinal2);
		
		boeing777 = new AvionGrande(pInicial, pIntermedia, 1);
		boeing777.actualizar(); // El avión se movió hacia la (0,1)
		boeing777.setRecorrido(posiciones); // "Hago clic" en las posición (1,1) y luego en la (1,2)
		boeing777.actualizar();
		boeing777.actualizar();
		boeing777.actualizar();
		boeing777.actualizar();
		boeing777.actualizar();
		boeing777.actualizar();
		
		assertTrue (boeing777.getPosicion().compararA(pArbitraria));
	}  
	
	public void testactualizarPosicionVerificarIntermedia()
	{
		pInicial = new Posicion(0,0);
		pIntermedia = new Posicion(0,50); // Hace que el avión se mueva en la dirección (0,1)
		pFinal1 = new Posicion(1,1);
		pFinal2 = new Posicion(1,2);
		pArbitraria = new Posicion(1,3);
		
		Queue<Posicion> posiciones = new LinkedList<Posicion>();
		posiciones.add(pFinal1);
		posiciones.add(pFinal2);
		
		boeing777 = new AvionGrande(pInicial, pIntermedia, 1);
		boeing777.actualizar(); // El avión se movió hacia la (0,1)
		boeing777.setRecorrido(posiciones); // "Hago clic" en las posición (1,1) y luego en la (1,2)
		boeing777.actualizar();
		boeing777.actualizar();
		boeing777.actualizar();

			
		
		assertTrue (boeing777.getPosicion().compararA(pArbitraria));
	}  
	
	
	public void testColisionEntreDosAviones()
	{
		pInicial = new Posicion(0,0);
		
		boeing777 = new AvionGrande(pInicial, trayect, 1);
		assertTrue (boeing777.colisionoCon(aeronaveChocadora));		
	}
	
	public void testNoColisionEntreDosAviones()
	{
		pInicial = new Posicion(0,0);
		
		boeing777 = new AvionGrande(pInicial, trayect, 1);
		assertFalse (boeing777.colisionoCon(aeronaveNoChocadora));		
	}
	
	}
