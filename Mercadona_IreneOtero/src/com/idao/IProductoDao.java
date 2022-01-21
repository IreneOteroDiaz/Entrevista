/**
 * Interfaz que registra los métodos CRUD
 * */

package com.idao;

import java.util.List;
import com.model.*;
 
public interface IProductoDao {	
	
	public int creacion(Producto producto) throws Exception;
	public boolean actualizar(Producto producto) throws Exception;
	public boolean eliminar(Producto producto) throws Exception;
	public List<Producto> recuperar() throws Exception;
	
}