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
	
	public List<Usuario> login(String correo, String pass){
		return dao.login(correo, pass);
	}
}
