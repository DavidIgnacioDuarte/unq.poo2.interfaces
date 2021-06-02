package unq.poo2.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestMercadoCentral1 {

//PRÁCTICA TDD (Test Driven Development)
	
	private MercadoCentral mercado; 
	private Caja caja;
	//en primera instancia no compilan
	
	private Producto pure1;
	private Producto pure2; //para probar sobre 'equals' 
	private Producto yogurt;
	private Producto galletitas;
	
	private ProductoCooperativa leche;
	private ProductoCooperativa aceite1; //para probar sobre 'equals'
	private ProductoCooperativa aceite2;
	private ProductoCooperativa harina;
	
	private ArrayList<Producto> productos1; //(stock de 2 purés)
	private ArrayList<Producto> productos2; //(stock de 2 aceites)
	
	@Before
	void setUp() throws Exception {
		
		this.mercado = new MercadoCentral();
		this.caja = new Caja();
		
		this.pure1 = new Producto(50, "pureMolto");
		this.pure2 = new Producto(50, "pureMolto");
		this.yogurt = new Producto(120, "yogurisimo");
		this.galletitas = new Producto(90, "traviata");
		this.leche = new ProductoCooperativa(95, "lecheSerenisima");
		this.aceite1 = new ProductoCooperativa(330, "cocinero");
		this.aceite2 = new ProductoCooperativa(330, "cocinero");
		this.harina = new ProductoCooperativa(60, "0000");
		
		this.productos1 = new ArrayList<Producto>();
		
		productos1.add(pure1); //p 50
		productos1.add(pure2); //p 50
		productos1.add(yogurt); //p 120
		productos1.add(leche); //p 95
		
		this.productos2 = new ArrayList<Producto>();
		
		productos2.add(aceite1); //p 330
		productos2.add(aceite2); //p 330
		productos2.add(harina); //p 60
		
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented"); //dejo esta sentencia hasta terminar de escribir el código.
	} //El test falla porque aún no está implementado

}
