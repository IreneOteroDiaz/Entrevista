/**
 * Se utiliza PreparedStatements para mejorar la eficiencia y seguridad de las consultas a la BD.
 * 
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
	
	public void prepararStatements(Connection con) {
		crearPreparedStatementCreacion(con);
		crearPreparedStatementActualizar(con);
		crearPreparedStatementEliminar(con);
		crearPreparedStatementVerListaProductos(con);
	}
	
	private void crearPreparedStatementCreacion(Connection con) {
		String sql="INSERT INTO productos values (NULL,?,?,?)";
		try {
			stmCrear = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementCreacion");
			e.printStackTrace();
		}
	}
	
	private void crearPreparedStatementActualizar(Connection con) {
		String sql="UPDATE PRODUCTOS SET nombre=?, marca=?, descripcion=? WHERE ID=?";
		try {
			stmAct = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementActualizar");
			e.printStackTrace();
		}
	}
	
	private void crearPreparedStatementEliminar(Connection con) {
		String sql="DELETE FROM PRODUCTOS WHERE ID=?";
		try {
			stmEli = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementEliminar");
			e.printStackTrace();
		}
	}
	
	private void crearPreparedStatementVerListaProductos(Connection con) {
		String sql="SELECT * FROM PRODUCTOS ORDER BY ID";
		try {
			stmVer = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println("Error: Clase PrepararStatements - crearPreparedStatementActualizar");
			e.printStackTrace();
		}
	}

	public PreparedStatement getStmCrear() {
		return stmCrear;
	}

	public PreparedStatement getStmAct() {
		return stmAct;
	}

	public PreparedStatement getStmEli() {
		return stmEli;
	}

	public PreparedStatement getStmVer() {
		return stmVer;
	}
	
}
