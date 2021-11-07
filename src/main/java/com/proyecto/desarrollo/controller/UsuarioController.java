package com.proyecto.desarrollo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.desarrollo.entity.LogIn;
import com.proyecto.desarrollo.entity.TipoUsuario;
import com.proyecto.desarrollo.entity.Usuario;
import com.proyecto.desarrollo.service.TipoUsuarioService;
import com.proyecto.desarrollo.service.UsuarioService;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService uService;
	@Autowired
	private TipoUsuarioService tuService;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/listar")
	public List<Usuario> listar(){
		return uService.listAll();
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/listarTipo")
	public List<TipoUsuario> listarTipo(){
		
		TipoUsuario seleccione = new TipoUsuario();
		
		seleccione.setCod_tipo_usuario(0);
		seleccione.setNom_nombre(".::SELECCIONE::.");
		
		List<TipoUsuario> lista = new ArrayList<TipoUsuario>();
		
		lista.add(seleccione);
		lista.addAll(tuService.listAll());
		
		return lista;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/login")
	public Usuario logIn(@RequestBody LogIn bean){
		return uService.logIn(bean.correo, bean.pass);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/registrar")
	public void registrar(@RequestBody Usuario bean) {
		uService.registrar(bean);
	}
	
	/*@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/actualizar")
	public void updateUsuario(@RequestBody Usuario bean) {
		
		uService.updateUsuario(
				bean.getCod_usuario(),
				bean.getNom_usuario(),
				bean.getApe_usuario(),
				bean.getCor_usuario(),
				bean.getCon_usuario(),
				bean.getDni_usuario(),
				bean.getTipo_usuario().getCod_tipo_usuario()
			);
	}*/
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/eliminarUsuario")
	public void eliminarUsuario(@RequestBody Usuario bean) {
		uService.eliminarUsuario(bean);
	}
}
