package com.example.demo.Usuario.dominio.dtos;

import com.example.demo.Usuario.dominio.Usuario;

public class UsuarioNewSurveyDto {
	
	private int usuarioId;
	
	private String usuario;

	public UsuarioNewSurveyDto(String username) {
		super();
	}

	public UsuarioNewSurveyDto(Usuario usuario) {
		super();
		this.usuarioId=usuario.getUsuarioId();
		this.usuario = usuario.getUsername();
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
