package com.example.demo.Usuario.infraestructura;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.demo.Usuario.dominio.Usuario;

@Service

public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {
		return usuarioDao.findAll();
	}
	
    public boolean existsByUsername(String nombreUsuario){
        return usuarioDao.existsByUsername(nombreUsuario);
    }
	
    public boolean existsByEmail(String email){
        return usuarioDao.existsByEmail(email);
    }
	
    public void save(Usuario usuario){
		usuarioDao.save(usuario);
    }

	@Override
	public Optional<Usuario> findByUsername(String nombreUsuario) {
		// TODO Auto-generated method stub
		return usuarioDao.findByUsername(nombreUsuario);
	}

}