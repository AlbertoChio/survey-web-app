package com.example.demo.surveyparticipant.dominio.dtos;

import com.example.demo.Usuario.dominio.Usuario;

public class SurveyparticipantNewSurveyDto {
	private String usuario;

	public SurveyparticipantNewSurveyDto() {
		super();
	}

	public SurveyparticipantNewSurveyDto(String usuario) {
		super();
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
