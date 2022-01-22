/**
 * Interfaz que registra los m�todos CRUD.
 * Al ser una interfaz solo contiene la firma de los m�todos.
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
	* Registro m�todo creaci�n.
	* @param producto, de tipo Producto, elemento que se desea insertar en la BD.
	* @return int con la identificaci�n que se le ha dado al producto una vez insertado.
	* @exception Exception.
	*/
	public int creacion(Producto producto) throws Exception;
	
	/**
	* Registro m�todo actualizar.
	* @param producto, de tipo Producto, elemento que se desea actualizar en la BD.
	* @return boolean que marca a true si el producto se ha actualizado con �xito.
	* @exception Exception.
	*/
	public boolean actualizar(Producto producto) throws Exception;
	
	/**
	* Registro m�todo eliminar.
	* @param producto, de tipo Producto, elemento que se desea borrar de la BD.
	* @return boolean que marca a true si el producto se ha eliminado con �xito.
	* @exception Exception.
	*/
	public boolean eliminar(Producto producto) throws Exception;
	
	/**
	* Registro m�todo recuperar.
	* @param sin uso.
	* @return lista con todos los productos almacenados en la BD.
	* @exception Exception.
	*/
	public List<Producto> recuperar() throws Exception;
	
}