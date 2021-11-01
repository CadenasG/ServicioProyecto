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
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usuario")
	private int cod_usuario; 
	@Column(name = "nom_usuario")
	private String nom_usuario;
	@Column(name = "ape_usuario")
	private String ape_usuario;
	@Column(name = "cor_usuario")
	private String cor_usuario;
	@Column(name = "con_usuario")
	private String con_usuario;
	@Column(name = "dni_usuario")
	private int dni_usuario;
	@ManyToOne
	@JoinColumn(name = "cod_tipo_usuario")
	private TipoUsuario tipo_usuario;
	
	public int getCod_usuario() {
		return cod_usuario;
	}
	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}
	public String getNom_usuario() {
		return nom_usuario;
	}
	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}
	public String getApe_usuario() {
		return ape_usuario;
	}
	public void setApe_usuario(String ape_usuario) {
		this.ape_usuario = ape_usuario;
	}
	public String getCor_usuario() {
		return cor_usuario;
	}
	public void setCor_usuario(String cor_usuario) {
		this.cor_usuario = cor_usuario;
	}
	public String getCon_usuario() {
		return con_usuario;
	}
	public void setCon_usuario(String con_usuario) {
		this.con_usuario = con_usuario;
	}
	public int getDni_usuario() {
		return dni_usuario;
	}
	public void setDni_usuario(int dni_usuario) {
		this.dni_usuario = dni_usuario;
	}
	public TipoUsuario getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(TipoUsuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	
}
