/**
 * Interfaz que registra los métodos CRUD.
 * Al ser una interfaz solo contiene la firma de los métodos.
 * 
 * @author Irene Otero
 * @version 1.0
 * @since   2022-01-22
 * */

package com.idao;

import java.util.List;
import com.model.*;
 
public interface IProductoDao {	
	
	/**
	* Registro método creación.
	* @param producto, de tipo Producto, elemento que se desea insertar en la BD.
	* @return int con la identificación que se le ha dado al producto una vez insertado.
	* @exception Exception.
	*/
	public int creacion(Producto producto) throws Exception;
	
	/**
	* Registro método actualizar.
	* @param producto, de tipo Producto, elemento que se desea actualizar en la BD.
	* @return boolean que marca a true si el producto se ha actualizado con éxito.
	* @exception Exception.
	*/
	public boolean actualizar(Producto producto) throws Exception;
	
	/**
	* Registro método eliminar.
	* @param producto, de tipo Producto, elemento que se desea borrar de la BD.
	* @return boolean que marca a true si el producto se ha eliminado con éxito.
	* @exception Exception.
	*/
	public boolean eliminar(Producto producto) throws Exception;
	
	/**
	* Registro método recuperar.
	* @param sin uso.
	* @return lista con todos los productos almacenados en la BD.
	* @exception Exception.
	*/
	public List<Producto> recuperar() throws Exception;
	
}