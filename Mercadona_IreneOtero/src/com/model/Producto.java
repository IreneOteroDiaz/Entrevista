/**
 * Mapea los atributos de la tabla "productos" de la BD "prod".
 * 
 * @author Irene Otero
 * @version 1.0
 * @since   2022-01-22
 * */

package com.model;

public class Producto {
	private int id;
	
	private String nombre;
	private String marca; 
	private String descripcion;
	
	/**
	* Constructor por defecto.
	*/
	public Producto() {}
	
	/**
	* Constructor con parámetros.
	* @param nombre, indica el nombre del producto.
	* @param marca, fabricante del producto.
	* @param descripcion, breve descripción de los aspetctos más importantes.
    */
	public Producto(String nombre, String marca, String descripcion) {
		this.id = id; //Autoincrementable en la BD - el usuario no le asigna el valor.
		this.nombre = nombre;
		this.setMarca(marca);
		this.setDescripcion(descripcion);
	}
	
	/**
	* Getter id, obtención del identificador.
	* @param sin uso.
	* @return int referente al id.
    */
	public int getId() {
		return id;
	}

	/**
	* Setter id, modificación del id del producto.
	* @param id.
	* @return nada.
    */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	* Getter nombre, obtención del nombre del producto.
	* @param sin uso.
	* @return String referente al nombre.
    */
	public String getNombre() {
		return nombre;
	}

	/**
	* Setter nombre, modificación del nombre del producto.
	* @param nombre.
	* @return nada.
    */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Getter marca, obtención de la marca del producto.
	* @param sin uso.
	* @return String referente a la marca.
    */
	public String getMarca() {
		return marca;
	}

	/**
	* Setter marca, modificación de la marca del producto.
	* @param marca.
	* @return nada.
    */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	* Getter descripcion, obtención de la descripción del producto.
	* @param sin uso.
	* @return String referente a la descripcion.
    */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	* Setter descripción, modificación de la descripción del producto.
	* @param descripcion.
	* @return nada.
    */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	* Método que devuelve todos los valores del producto en un mismo String.
	* @param sin uso.
	* @return String con parámetros.
    */
	@Override
	public String toString() {
		return this.id + ", " + this.nombre + " (" + this.marca + ") -- " + this.descripcion;
	}
	
}
