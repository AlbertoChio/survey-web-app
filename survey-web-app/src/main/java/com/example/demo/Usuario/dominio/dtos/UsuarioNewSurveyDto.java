package com.example.demo.Usuario.dominio.dtos;

import com.example.demo.Usuario.dominio.Usuario;

public class UsuarioNewSurveyDto {

	private String username;

	public UsuarioNewSurveyDto(String username) {
		super();
		this.username = username;
	}

	public UsuarioNewSurveyDto(Usuario usuario) {
		super();
		this.username = usuario.getUsername();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
