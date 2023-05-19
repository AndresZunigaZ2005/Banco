package ejercicio16I03I23;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

	private String nombre;
	private List<Producto> listaProductos;
	
	public Tienda() {
		
	}

	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
		this.listaProductos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", listaProductos=" + listaProductos + "]";
	}
	
	public void agregarProducto(Producto producto) {
		listaProductos.add(producto);
	}
	
	public String obtenerProductoCategoria(Categoria categoria) {
		String productoEncontrado = "";
		for (Producto producto : listaProductos) {
			if(producto.getCategoria().equals(categoria)) {
				productoEncontrado += producto.toString();
			}
		}
		return productoEncontrado;
	}
	
	public String buscarProductoNombre(String nombre) {
		String nombreEncontrado = "";
		for (Producto producto : listaProductos) {
			if(producto.getNombre().equals(nombre)) {
				nombreEncontrado += producto.toString();
			}
		}
		return nombreEncontrado;
	}
	
	public String buscarProductoDescripcion(String descripcion) {
		String descricionEncontrada = "";
		for (Producto producto : listaProductos) {
			if(producto.getDescirpcion().equals(descripcion)) {
				descricionEncontrada += producto.toString();
			}
		}
		return descricionEncontrada;
	}
}
