package unq.poo2.mercadoCentral;

import java.util.ArrayList;

public class MercadoCentral {

	
	public ArrayList<Producto> stock;
	
	
	public MercadoCentral() {
		this.stock = new ArrayList<Producto>();
	}
	
	
	public void decrementarStock(Producto producto) {
		
		try {
			Producto productoActual = this.encontrar(producto);
			stock.remove(productoActual);
		}
		catch(Exception exc) {
			System.out.println("No tenemos stock de " + producto.getNombre());
		}
		
	}
	
	
	private Producto encontrar(Producto producto) {
		return stock.stream().filter(p -> p.equals(producto)).findFirst().get();
	}
	
	
	public void incrementarStock(ArrayList<Producto> productos) {
		
		for(Producto producto:productos) {
			stock.add(producto);
		}
		
	}
	
	
}
