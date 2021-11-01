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
@Table(name = "tb_tipo_producto")
public class TipoProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_tipo_producto")
	private int cod_tipo_producto;
	@Column(name = "nom_nombre")
	private String nom_nombre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tipo_producto")
	private List<Producto> listProducto;
}
