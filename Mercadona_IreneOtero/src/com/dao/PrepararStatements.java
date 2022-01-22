/**
 * Se utiliza PreparedStatements para mejorar la eficiencia y seguridad de las consultas a la BD.
 * 
 * @author Irene Otero
 * @version 1.0
 * @since   2022-01-22
 * */

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepararStatements {
	
	private PreparedStatement stmCrear;
	private PreparedStatement stmAct;
	private PreparedStatement stmEli;
	private PreparedStatement stmVer;
	
	/**
	* Método que preprocesa todas las sentencias.
	* @param con (la conexión).
	* @return nada.
	*/
	public void prepararStatements(Connection con) {
		crearPreparedStatementCreacion(con);
		crearPreparedStatementActualizar(con);
		crearPreparedStatementEliminar(con);
		crearPreparedStatementVerListaProductos(con);
	}
	
	/**
	* Preprocesamiento de la sentencia relacionada con la creación del producto.
	* @param con (la conexión).
	* @return nada.
	*/
	private void crearPreparedStatementCreacion(Connection con) {
		String sql="INSERT INTO productos values (NULL,?,?,?)";
		try {
			stmCrear = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementCreacion");
			e.printStackTrace();
		}
	}
	
	/**
	* Preprocesamiento de la sentencia relacionada con la actualización del producto.
	* @param con (la conexión).
	* @return nada.
	*/
	private void crearPreparedStatementActualizar(Connection con) {
		String sql="UPDATE PRODUCTOS SET nombre=?, marca=?, descripcion=? WHERE ID=?";
		try {
			stmAct = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementActualizar");
			e.printStackTrace();
		}
	}
	
	/**
	* Preprocesamiento de la sentencia relacionada con la eliminación del producto.
	* @param con (la conexión).
	* @return nada.
	*/
	private void crearPreparedStatementEliminar(Connection con) {
		String sql="DELETE FROM PRODUCTOS WHERE ID=?";
		try {
			stmEli = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementEliminar");
			e.printStackTrace();
		}
	}
	
	/**
	* Preprocesamiento de la sentencia relacionada con la visión de la lista de productos.
	* @param con (la conexión).
	* @return nada.
	*/
	private void crearPreparedStatementVerListaProductos(Connection con) {
		String sql="SELECT * FROM PRODUCTOS ORDER BY ID";
		try {
			stmVer = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementActualizar");
			e.printStackTrace();
		}
	}

	/**
	* Getter stmCrear de la creacion.
	* @param sin uso.
	* @return stmCrear.
    */
	public PreparedStatement getStmCrear() {
		return stmCrear;
	}

	/**
	* Getter stmAct de la actualización.
	* @param sin uso.
	* @return stmAct.
    */
	public PreparedStatement getStmAct() {
		return stmAct;
	}

	/**
	* Getter stmEli del borrado.
	* @param sin uso.
	* @return stmEli.
    */
	public PreparedStatement getStmEli() {
		return stmEli;
	}

	/**
	* Getter stmVer de la visión del listado de productos.
	* @param sin uso.
	* @return stmVer.
    */
	public PreparedStatement getStmVer() {
		return stmVer;
	}
	
}
