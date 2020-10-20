package com.example.demo.Usuario.aplicacion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.infraestructura.IUsuarioService;
import com.example.demo.rol.dominio.Rol;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService usuarioService;

	@JsonView(Views.User.class)
	@GetMapping("/usuarios/")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MappingJacksonValue>  index() {
		//Set<Rol> rols = new HashSet<Rol>(0);
		//rols.add(new Rol(1,"ROLE_ADMIN"));
		//Usuario rolUser = new Usuario();
		//rolUser.setUsername("nuevouser");
		//rolUser.setRols(rols);
		//usuarioService.save(rolUser);
	   
	    
	       
		List<Usuario> usuarios= usuarioService.findAll();
		 MappingJacksonValue jacksonValue = new MappingJacksonValue(usuarios);
		 jacksonValue.setSerializationView(Views.User.class);
		    return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
			
	}
  	
}
