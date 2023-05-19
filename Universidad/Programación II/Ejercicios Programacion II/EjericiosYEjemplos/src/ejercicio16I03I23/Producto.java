package ejercicio16I03I23;

public class Producto {

	private String nombre;
	private String descirpcion;
	private double precio;
	private int cantidadStock;
	private Categoria categoria;
	
	public Producto() {
		
	}
	
	/**
	 * 
	 * @param nombre
	 * @param descirpcion
	 * @param precio
	 * @param cantidadStock
	 * @param categoria
	 */
	public Producto(String nombre, String descirpcion, double precio, int cantidadStock, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.descirpcion = descirpcion;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescirpcion() {
		return descirpcion;
	}

	public void setDescirpcion(String descirpcion) {
		this.descirpcion = descirpcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descirpcion=" + descirpcion + ", precio=" + precio + ", cantidadStock="
				+ cantidadStock + ", categoria=" + categoria + "]";
	}
	
	public Producto buscarProductoNombre(String nombre) {
		if(getNombre().equals(nombre)) {
			Producto producto = new Producto();
		}
		return null;
	}
}
