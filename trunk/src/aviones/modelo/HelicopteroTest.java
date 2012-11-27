package aviones.modelo;

import junit.framework.TestCase;


public class HelicopteroTest extends TestCase {

	Helicoptero helicopteroPresidencial;
	Helicoptero aeronaveChocadora;
	AvionChico aeronaveNoChocadora;
	Posicion pInicial;
	Posicion otraPInicial;
	Posicion pFinal;
	Posicion pFinal1;
	Posicion pFinal2;
	Posicion pInicialColision;
	Posicion trayect;
	Posicion pArbitraria;
	double vel = 0.5;
	
	public void setUp() 
	{
			pInicial = new Posicion(1,0);
			pInicialColision = new Posicion(1,6);

			otraPInicial = new Posicion(30,9);
			trayect = new Posicion (4,0);
			helicopteroPresidencial = new Helicoptero(pInicial, trayect, vel);
			aeronaveChocadora = new Helicoptero(pInicialColision, trayect, vel);
			aeronaveNoChocadora = new AvionChico(otraPInicial, trayect, vel);
	}

	
	public void testActualizarPosicionUnPaso()
	{
		pArbitraria = new Posicion(1,3);
		pFinal = new Posicion(1,80);
		helicopteroPresidencial = new Helicoptero(pInicial,pFinal,3);
		helicopteroPresidencial.actualizar();
		assertTrue ( helicopteroPresidencial.getPosicion().compararA(pArbitraria));
	} 
	
	public void testActualizarPosicionDosPasos()
	{
		pArbitraria = new Posicion(1,6);
		pFinal = new Posicion(1,80);
		helicopteroPresidencial = new Helicoptero(pInicial,pFinal,3);
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		assertTrue ( helicopteroPresidencial.getPosicion().compararA(pArbitraria));
	} 
	
	public void testActualizarPosicionDiezPasos()
	{
		pArbitraria = new Posicion(1,30);
		pFinal = new Posicion(1,80);
		helicopteroPresidencial = new Helicoptero(pInicial,pFinal,3);
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		assertTrue ( helicopteroPresidencial.getPosicion().compararA(pArbitraria));
	} 
	
	public void testActualizarPosicionFalse()
	{
		pArbitraria = new Posicion(51,0);
		pFinal = new Posicion(50,0);
		helicopteroPresidencial = new Helicoptero(pInicial,pFinal,50);
		helicopteroPresidencial.actualizar();
		assertTrue ( helicopteroPresidencial.getPosicion().compararA(pArbitraria));
	} 
	
	public void testVerificarHelicopteroFrenado()
	{
		pArbitraria = new Posicion(3,0);
		pFinal = new Posicion(3,0);
		helicopteroPresidencial = new Helicoptero(pInicial,pFinal,0.5);
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		
		assertTrue ( helicopteroPresidencial.getPosicion().compararA(pArbitraria));
	} 
	
	public void testVerificarHelicopteroFrenadoConColaDePosiciones() 
	{
		pFinal1 = new Posicion(3,1);
		pFinal2 = new Posicion(3,2);
		pFinal = new Posicion(1,20);
		pArbitraria = new Posicion(3,2);
		
		helicopteroPresidencial = new Helicoptero(pInicial,pFinal,1);
		helicopteroPresidencial.actualizar();
		
		helicopteroPresidencial.cambiarRecorrido(pFinal1);
		helicopteroPresidencial.agregarAlRecorrido(pFinal2);

		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		
		assertTrue ( helicopteroPresidencial.getPosicion().compararA(pArbitraria));
		
		
	}
	
	public void testVerificarHelicopteroPasaPorIntermedia() 
	{
		pFinal1 = new Posicion(3,1);
		pFinal2 = new Posicion(3,2);
		pFinal = new Posicion(1,20);
		pArbitraria = new Posicion(3,1);
		
		helicopteroPresidencial = new Helicoptero(pInicial,pFinal,1);
		helicopteroPresidencial.actualizar();
		
		helicopteroPresidencial.cambiarRecorrido(pFinal1);
		helicopteroPresidencial.agregarAlRecorrido(pFinal2);

		helicopteroPresidencial.actualizar();
		helicopteroPresidencial.actualizar();
		
		assertTrue ( helicopteroPresidencial.getPosicion().compararA(pArbitraria));
		
		
	}
	
	public void testColisionEntreDosAviones()
	{
		assertTrue (helicopteroPresidencial.colisionoCon(aeronaveChocadora));		
	}
	
	public void testNoColisionEntreDosAviones()
	{
		assertFalse (helicopteroPresidencial.colisionoCon(aeronaveNoChocadora));		
	}
	
	public void testGetPosicionActual()
	{
		pArbitraria = new Posicion(1,0); 
		
		assertTrue (	pInicial.compararA(pArbitraria)	);
	}
	
}
