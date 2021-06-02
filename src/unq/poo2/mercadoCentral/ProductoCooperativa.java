package unq.poo2.mercadoCentral;

public class ProductoCooperativa extends Producto {

	
	
	public ProductoCooperativa(double precio, String nombre) {
		super(precio, nombre);
	}
	
	@Override
	public double getPrecio() {
		
		double descuento = precio * 0.1;
		
		return precio - descuento;
		
	}
	
	
}
