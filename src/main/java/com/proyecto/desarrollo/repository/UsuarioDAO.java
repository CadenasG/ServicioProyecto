package com.proyecto.desarrollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.desarrollo.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>{
	
	@Query("select u from Usuario u where u.cor_usuario = ?1 and u.con_usuario = ?2")
	public Usuario logIn(String correo, String pass);
	
	@Query("delete from Usuario u where u.cod_usuario=?1")
	public void eliminarUsuario(int cod);
	
	/*@Modifying
	@Query("update Usuario u "
			+ "set u.nom_usuario=?1, u.ape_usuario=?2, u.cor_usuario=?3"
			+ ", u.con_usuario=?4, u.dni_usuario=?5, u.cod_tipo_usuario=?6 where u.cod_usuario=?7")
	public void updateUsuario(
			
			String nom_usuario,
			String ape_usuario,
			String cor_usuario,
			String con_usuario,
			int dni_usuario,
			int cod_tipo_usuario,
			int cod_usuario
			);*/
	
}
