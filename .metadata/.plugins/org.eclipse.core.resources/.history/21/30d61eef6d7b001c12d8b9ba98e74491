/**
 * 	Mapea los atributos de la tabla "Producto" de la BD.
 * 
 * ACLARACIONES:
 * id --> {Primary Key}
 * nombre --> {Valor No Nulo} (No he marcado unicidad por si se quisiera tener varios productos con el mismo nombre y diferente marca).
 * marca --> {Valor No Nulo}
 * descripcion --> sin restricciones ((Para poder añadir productos inicialmente sin necesidad de marcar ninguna descipción)
 * */

package com.model;

public class Producto {
	private int id;
	
	private String nombre;
	private String marca; 
	private String descripcion;
	
	public Producto() {}
	
	public Producto(String nombre, String marca, String descripcion) {
		this.id = id; //Autoincrementable en la BD - el usuario no le asigna el valor.
		this.nombre = nombre;
		this.setMarca(marca);
		this.setDescripcion(descripcion);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.nombre + " (" + this.marca + ") -- " + this.descripcion;
	}
	
}
