package com.proyecto.desarrollo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.desarrollo.entity.Usuario;
import com.proyecto.desarrollo.service.UsuarioService;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService uService;
	
	@GetMapping("/listar")
	public List<Usuario> listar(){
		return uService.listAll();
	}
	
	//@CrossOrigin(origins="http://localhost:8092")
	@GetMapping("/consulta/{correo}/{pass}")
	public List<Usuario> consulta(@PathVariable("correo") String correo,@PathVariable("pass") String pass){
		return uService.login(correo, pass);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Usuario bean) {
		uService.registrar(bean);
	}
}
