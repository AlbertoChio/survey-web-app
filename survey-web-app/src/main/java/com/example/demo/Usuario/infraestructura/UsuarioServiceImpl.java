package com.example.demo.Usuario.infraestructura;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.dominio.dtos.UsuarioNewSurveyDto;
import com.example.demo.security.dominio.dtos.NuevosUsuarios;
import com.example.demo.survey.dominio.Segmentation;
import com.example.demo.survey.dominio.dtos.SurveyListDto;

@Service

public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {
		return usuarioDao.findAll();
	}

	public boolean existsByUsername(String nombreUsuario) {
		return usuarioDao.existsByUsername(nombreUsuario);
	}

	public boolean existsByEmail(String email) {
		return usuarioDao.existsByEmail(email);
	}

	public void save(Usuario usuario) {
		usuarioDao.save(usuario);
	}
	
	public void saveAll(Set<Usuario> usuario) {
		usuarioDao.saveAll(usuario);
	}

	@Override
	public Usuario findByUsername(String nombreUsuario) {
		return usuarioDao.findByUsername(nombreUsuario);
	}

	@Override
	public List<UsuarioNewSurveyDto> findAllUsuario() {
		List<Usuario> usuarios = usuarioDao.findAll();
		List<UsuarioNewSurveyDto> usuarioNewSurveyDto = usuarios.stream().map(temp -> {
			UsuarioNewSurveyDto p = new UsuarioNewSurveyDto(temp);
			return p;
		}).collect(Collectors.toList());
		return usuarioNewSurveyDto;
	}
	
	public boolean existsByUsernames(NuevosUsuarios nuevoUsuarios) {
		
		Set<Boolean > unExitentsUsuarios= new HashSet<Boolean>(0);
		unExitentsUsuarios= nuevoUsuarios.getUsuarios().stream().map(temp->{
			return usuarioDao.existsByUsername(temp.getNombreUsuario());
		}).collect(Collectors.toSet());
		
		return unExitentsUsuarios.contains(true);
	}

}