package com.proyecto.desarrollo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_tipo_usuario")
	private int cod_tipo_usuario;
	@Column(name = "nom_nombre")
	private String nom_nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tipo_usuario")
	private List<Usuario> listUsuario;

	public int getCod_tipo_usuario() {
		return cod_tipo_usuario;
	}

	public void setCod_tipo_usuario(int cod_tipo_usuario) {
		this.cod_tipo_usuario = cod_tipo_usuario;
	}

	public String getNom_nombre() {
		return nom_nombre;
	}

	public void setNom_nombre(String nom_nombre) {
		this.nom_nombre = nom_nombre;
	}

	public List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}
	
	
	
}
