/**
 * Lugar donde se van a mostrar los datos del modelo (a través del controlador)
 * 
 * @author Irene Otero
 * @version 1.0
 * @since   2022-01-22
 * */

package com.vista;

import java.util.List;
import com.model.Producto;

public class ViewProducto {
	
	/**
	* Método que permite ver un producto de manera individual.
	* @param producto, de tipo Producto, elemento que se desea visualizar por pantalla.
	* @return nada.
	*/
	public void verProducto(Producto producto) {
		System.out.println("Producto: " + producto);
	}
	
	/**
	* Método que permite ver un listado de productos.
	* @param List<Producto>, lista que contiene los productos que se desean visualizar por pantalla.
	* @return nada.
	*/
	public void verListaProductos(List<Producto> listaProductos) {
		System.out.println("------ LISTA DE PRODUCTOS ------");
		for (Producto producto : listaProductos) {
			System.out.println("Producto:" + producto);
		}		
	}
}
