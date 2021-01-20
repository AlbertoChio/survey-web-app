package com.example.demo.Usuario.infraestructura;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.dominio.dtos.UsuarioNewSurveyDto;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Optional<Usuario> findByUsername(String nombreUsuario);

	public void save(Usuario usuario);

	public List<UsuarioNewSurveyDto> findAllUsuario();
}
