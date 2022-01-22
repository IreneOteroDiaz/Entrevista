/**
 * Enlaza el acceso a los datos con la vista.
 * 
 * @author Irene Otero
 * @version 1.0
 * @since   2022-01-22
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
	
	/**
	* Constructor de la clase.
	* La finalidad de su creaci�n es el paso del par�metro de entrada.
	* @param ps, de tipo PrepararStatements
	*/
	public ControllerProducto(PrepararStatements ps) {
		this.ps = ps;
	}
	
	/**
	* Enlace m�todo creaci�n.
	* @param producto, de tipo Producto, elemento que se desea insertar en la BD.
	* @return int con la identificaci�n que se le ha dado al producto una vez insertado.
	* @exception Exception.
	*/
	public int creacion(Producto producto) throws Exception {
		IProductoDao dao= new ProductoDao(ps);
		return dao.creacion(producto);
	}
	
	/**
	* Enlace m�todo actualizar.
	* @param producto, de tipo Producto, elemento que se desea actualizar en la BD.
	* @return boolean que marca a true si el producto se ha actualizado con �xito.
	* @exception Exception.
	*/
	public void actualizar(Producto producto) throws Exception {
		IProductoDao dao= new ProductoDao(ps);
		dao.actualizar(producto);
	}
	
	/**
	* Enlace m�todo eliminar.
	* @param producto, de tipo Producto, elemento que se desea borrar de la BD.
	* @return boolean que marca a true si el producto se ha eliminado con �xito.
	* @exception Exception.
	*/
	public void eliminar(Producto producto) throws Exception {
		IProductoDao dao= new ProductoDao(ps);
		dao.eliminar(producto);
	}
	
	/**
	* Enlace m�todo recuperar.
	* @param sin uso.
	* @return lista con todos los productos almacenados en la BD.
	* @exception Exception.
	*/
	public void verListaProductos() throws Exception{
		List<Producto> listaProductos = new ArrayList<Producto>();
		IProductoDao dao = new ProductoDao(ps);
		listaProductos = dao.recuperar();
		vista.verListaProductos(listaProductos);
	}
	
	
}
