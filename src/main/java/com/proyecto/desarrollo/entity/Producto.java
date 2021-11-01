package com.proyecto.desarrollo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_producto")
	private int cod_producto;
	@Column(name = "nom_producto")
	private String nom_producto;
	@Column(name = "des_producto")
	private String des_producto;
	@Column(name = "pre_producto")
	private double pre_producto;
	@ManyToOne
	@JoinColumn(name = "cod_tipo_producto")
	private TipoProducto tipo_producto;
	
	public int getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(int cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNom_producto() {
		return nom_producto;
	}
	public void setNom_producto(String nom_producto) {
		this.nom_producto = nom_producto;
	}
	public String getDes_producto() {
		return des_producto;
	}
	public void setDes_producto(String des_producto) {
		this.des_producto = des_producto;
	}
	public double getPre_producto() {
		return pre_producto;
	}
	public void setPre_producto(double pre_producto) {
		this.pre_producto = pre_producto;
	}
	public TipoProducto getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(TipoProducto tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	
	
	
}
