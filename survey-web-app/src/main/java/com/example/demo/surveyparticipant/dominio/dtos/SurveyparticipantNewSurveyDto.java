package com.example.demo.surveyparticipant.dominio.dtos;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;

public class SurveyparticipantNewSurveyDto {
	
	private int usuarioId;
	private String usuario;

	public SurveyparticipantNewSurveyDto() {
		super();
	}

	public SurveyparticipantNewSurveyDto(String usuario) {
		super();
		this.usuario = usuario;
	}

	public SurveyparticipantNewSurveyDto(Surveyparticipant temp) {
		super();
		usuarioId=temp.getUsuario().getUsuarioId();
		usuario=temp.getUsuario().getUsername();
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
