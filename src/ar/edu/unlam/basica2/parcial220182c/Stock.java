package ar.edu.unlam.basica2.parcial220182c;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stock {

	private Set<Producto> listaDeProducto;

	public Stock() {

		listaDeProducto = new HashSet<Producto>();

	}

	public void agregarProductos(Producto producto) throws ProductoDuplicado {
		if (!listaDeProducto.contains(producto))
			listaDeProducto.add(producto);
		else
			throw new ProductoDuplicado("el Producto ya existe");

	}

	public void eliminarProducto(Producto producto) throws ProductoInexistente {

		if (listaDeProducto.contains(producto))
			listaDeProducto.remove(producto);
		else
			throw new ProductoInexistente("el Producto no Existe");

	}

	public void incrementarPrecios(Double porcentajeIncremento) {

		for (Producto producto : listaDeProducto) {

			producto.setPrecio(producto.getPrecio() * (1 + porcentajeIncremento / 100));

		}

	}

	public List<DiscoRigido> obtenerListaDiscoRigido() {

		List<DiscoRigido> listaDiscos = new ArrayList();

		for (Producto producto : listaDeProducto) {
			if (producto instanceof DiscoRigido) {
				listaDiscos.add((DiscoRigido) producto);
			}
		}
		return listaDiscos;

	}

	public void descontarProducto(Integer cantidadaDescontar, Integer idProducto) throws CantidadInvalida, 
	                                                                                     SuperaMaximoADescontarException, 
	                                                                                     ProductoInexistente {
		if (cantidadaDescontar < 0) {
			throw new CantidadInvalida("la Cantidad Debe ser mayor a 0");
		}
		for (Producto producto : listaDeProducto) {
			if (producto.getId().equals(idProducto)) {
				if (producto.getCantidadDisponible() >= cantidadaDescontar) {
					producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidadaDescontar);
					
					
				}else throw new SuperaMaximoADescontarException("usted quiere eliminar " + cantidadaDescontar +
						                                         "y solo Dispone" + producto.getCantidadDisponible());
				
				
			}
		}
		throw new ProductoInexistente("no se encontro el producto");
	}
	
	
	

	public Set<Producto> getStock() {
		return listaDeProducto;
	}

	public void setStock(Set<Producto> stock) {
		this.listaDeProducto = stock;
	}

}
