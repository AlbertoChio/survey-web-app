package com.example.demo.survey.aplicacion;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.infraestructura.IUsuarioService;
import com.example.demo.rol.dominio.RolNombre;
import com.example.demo.security.dominio.dtos.NuevoUsuario;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.survey.dominio.dtos.SurveyNewSurveyDto;
import com.example.demo.survey.infraestructura.ISurveyService;
import com.example.demo.util.dominio.Mensaje;
import com.example.demo.util.dominio.Views;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class SurveyRestController {

	@Autowired
	ObjectMapper mapper;

	@Autowired
	private ISurveyService surveyService;
	private final Logger log = LoggerFactory.getLogger(SurveyRestController.class);

	@GetMapping("/encuestass")
	@ResponseStatus(HttpStatus.OK)
	public List<SurveyListDto> index() {
		List<Survey> surveys = surveyService.findAll();
		List<SurveyListDto> surveysListDto = surveyService.listSurveyListDto(surveys);
		return surveysListDto;
	}

	@GetMapping("/encuesta/answer/{surveyname}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> surveyuserParticipantRequestSurvey(@PathVariable("surveyname") String surveyname,
			Authentication authentication) {
		if (surveyService.canUserStartSurvey(authentication.getName(), surveyname)) {
			Survey survey = surveyService.findBySurveyName(surveyname);
			MappingJacksonValue jacksonValue = new MappingJacksonValue(
					surveyService.SurveyToSurveyNewAnswerDto(surveyService.findBySurveyName(surveyname)));
			return new ResponseEntity(jacksonValue, HttpStatus.OK);
		}
		return new ResponseEntity(
				new Mensaje("Encuesta expirada, inactiva o ya has excedido el número de aplicaciones permitidas"),
				HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/encuesta/chart/{surveyname}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> surveyuserRequestSurveyChartsDto(@PathVariable("surveyname") String surveyname) {
		MappingJacksonValue jacksonValue = new MappingJacksonValue(
				surveyService.SurveyToSurveyChartDto(surveyService.findBySurveyName(surveyname)));
		return new ResponseEntity(jacksonValue, HttpStatus.OK);

	}

	@PostMapping("/encuesta/new-encuesta")
	public ResponseEntity<?> surveyadminsubmitSurveyNewSurveyDto(@Valid @RequestBody SurveyNewSurveyDto surveydto,
			BindingResult result) {
		if (result.hasErrors())
			return new ResponseEntity(new Mensaje("campos mal puestos"), HttpStatus.BAD_REQUEST);
		Survey survey = surveyService.NewSurveyRecord(surveydto);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(survey);
		return new ResponseEntity(jacksonValue, HttpStatus.OK);
	}

}
