package unq.poo2.mercadoCentral;

public class Producto {

	
	protected double precio;
	protected String nombre;
	
	
	public Producto(double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object o) {
		return (((Producto) o).getNombre() == this.getNombre());
	}
	
}
