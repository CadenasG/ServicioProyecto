package com.proyecto.desarrollo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.desarrollo.entity.TipoUsuario;
import com.proyecto.desarrollo.repository.TipoUsuarioDAO;

@Service
public class TipoUsuarioService {
	@Autowired
	private TipoUsuarioDAO dao;
	
	public List<TipoUsuario> listAll(){
		 return dao.findAll();
	 }
}
