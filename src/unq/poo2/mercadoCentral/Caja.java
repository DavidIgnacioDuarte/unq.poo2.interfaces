package unq.poo2.mercadoCentral;

import java.util.ArrayList;

public class Caja {

	
	private MercadoCentral mercado;
	
	
	public Caja() {
		super();
	}
	
	public void registrarProducto(Producto producto) {
		
	} //POR AHORA NO PARECE ÚTIL
	
	public void registrarProductos(ArrayList<Producto> productos) {
		
		double montoTotal = 0;
		for(Producto producto:productos) {
			montoTotal += producto.getPrecio();
			mercado.decrementarStock(producto);
		}
		System.out.println("El monto a pagar es de " + montoTotal);
		
	}
	
}
