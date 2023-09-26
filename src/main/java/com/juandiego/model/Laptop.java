package com.juandiego.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_productos")
public class Laptop {

	@Id
	@Column(name="id_prod")
	private String codigo;
	
	@Column(name="des_prod")
	private String descripcion;
	
	@Column(name="pre_prod")
	private double precio;
	
	@Column(name="stk_prod")
	private int stock;
	
	private int idCategoria;
	

	
	private int idProveedor;



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public int getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}



	public int getIdProveedor() {
		return idProveedor;
	}



	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
}
