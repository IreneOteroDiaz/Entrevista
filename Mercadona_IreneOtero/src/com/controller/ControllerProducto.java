/**
 * Enlaza el acceso a los datos con la vista.
 * */

package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.dao.PrepararStatements;
import com.dao.ProductoDao;
import com.idao.IProductoDao;
import com.model.Producto;
import com.vista.ViewProducto;

public class ControllerProducto {
	
	private ViewProducto vista = new ViewProducto();
	private PrepararStatements ps;
	public ControllerProducto(PrepararStatements ps) {
		this.ps = ps;
	}
	
	public int creacion(Producto producto) throws Exception {
		IProductoDao dao= new ProductoDao(ps);
		return dao.creacion(producto);
	}
	
	public void actualizar(Producto producto) throws Exception {
		IProductoDao dao= new ProductoDao(ps);
		dao.actualizar(producto);
	}
	
	public void eliminar(Producto producto) throws Exception {
		IProductoDao dao= new ProductoDao(ps);
		dao.eliminar(producto);
	}
	
	public void verListaProductos() throws Exception{
		List<Producto> listaProductos = new ArrayList<Producto>();
		IProductoDao dao = new ProductoDao(ps);
		listaProductos = dao.recuperar();
		vista.verListaProductos(listaProductos);
	}
	
	
}