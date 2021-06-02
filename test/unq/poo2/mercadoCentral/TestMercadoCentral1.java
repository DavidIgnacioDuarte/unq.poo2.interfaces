package unq.poo2.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMercadoCentral1 {

//PRÁCTICA TDD (Test Driven Development)
	
	private MercadoCentral mercado; 
	private Caja caja;
	//en primera instancia no compilan
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.mercado = new MercadoCentral();
		this.caja = new Caja();
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented"); //dejo esta sentencia hasta terminar de escribir el código.
	} //El test falla porque aún no está implementado

}
