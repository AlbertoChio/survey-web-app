package com.example.demo.rol.dominio;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.infraestructura.IUsuarioService;


/**
 * MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR LOS ROLES.
 * UNA VEZ CREADOS SE DEBERÁ ELIMINAR O BIEN COMENTAR EL CÓDIGO
 *
 */

@Component
public class CreateRoles implements CommandLineRunner {

    
    @Autowired
    IUsuarioService usuarioService;
    
    @Override
    public void run(String... args) throws Exception {
    	/*
    	 * 
    	 
    	Set<Rol> rols = new HashSet<Rol>(0);
    	rols.add(new Rol(1,"ROLE_ADMIN"));
    	Usuario rolUser = new Usuario();
    	rolUser.setUsername("nuevouser");
    	rolUser.setRols(rols);
    	usuarioService.save(rolUser);
*/
    }
}
