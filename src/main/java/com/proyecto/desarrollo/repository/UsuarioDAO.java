package com.proyecto.desarrollo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.desarrollo.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer>{
	@Query("select u from Usuario u where u.cor_usuario = ?1 and u.con_usuario = ?2")
	public List<Usuario> login(String correo, String pass);
	
	@Query("select u from Usuario u where u.cor_usuario = ?1 and u.con_usuario = ?2")
	public Usuario login2(String correo, String pass);
}
