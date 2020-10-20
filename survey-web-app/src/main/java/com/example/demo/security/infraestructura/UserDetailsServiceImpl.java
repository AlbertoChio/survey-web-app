package com.example.demo.security.infraestructura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.dominio.UsuarioPrincipal;
import com.example.demo.Usuario.infraestructura.IUsuarioDao;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    IUsuarioDao usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findByUsername(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
}
