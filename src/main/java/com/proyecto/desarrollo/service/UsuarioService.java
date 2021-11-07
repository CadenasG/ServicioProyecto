package com.proyecto.desarrollo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.desarrollo.entity.Usuario;
import com.proyecto.desarrollo.repository.UsuarioDAO;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioDAO dao;
	
	public void registrar(Usuario bean) {
		dao.save(bean);
	}
	
	public List<Usuario> listAll(){
		return dao.findAll();
	}
	
	public Usuario logIn(String correo, String pass){
		return dao.logIn(correo, pass);
	}
	
	/*public void updateUsuario(
			int cod_usuario,
			String nom_usuario,
			String ape_usuario,
			String cor_usuario,
			String con_usuario,
			int dni_usuario,
			int cod_tipo_usuario
			) {
		dao.updateUsuario(
				nom_usuario,
				ape_usuario,
				cor_usuario,
				con_usuario,
				dni_usuario,
				cod_tipo_usuario,
				cod_usuario
				);
	}*/
	
	public void eliminarUsuario(Usuario bean) {
		dao.eliminarUsuario(bean.getCod_usuario());
	}
}
