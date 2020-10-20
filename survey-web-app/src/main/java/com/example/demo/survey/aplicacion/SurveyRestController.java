package com.example.demo.survey.aplicacion;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
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

	@GetMapping("/encuestasss")
	@ResponseStatus(HttpStatus.OK)
	public List<Survey> indexx() {
		List<Survey> surveys=surveyService.findAll();
		
		return surveys;
	}


	@GetMapping("/encuestass")
	@ResponseStatus(HttpStatus.OK)
	public List<SurveyListDto> index() {
		List<Survey> surveys=surveyService.findAll();
		List<SurveyListDto> surveysListDto = surveyService.listSurveyListDto(surveys);
		return surveysListDto;
	}

	@GetMapping("/encuesta")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MappingJacksonValue>  listmysurveyparticiants(Authentication authentication) {
		List<Survey> surveys=surveyService.findBySurveyparticipantsUsuarioUsername(authentication.getName());
		List<SurveyListDto> surveysListDto = surveyService.listSurveyListDto(surveys);
		
		
	    MappingJacksonValue jacksonValue = new MappingJacksonValue(surveysListDto);

	    if (authentication.getAuthorities().contains(new SimpleGrantedAuthority(RolNombre.ROLE_ADMIN.toString()))) {
	    	log.info("Admin");
	        jacksonValue.setSerializationView(Views.Admin.class);
	    } else if (authentication.getAuthorities().contains(new SimpleGrantedAuthority(RolNombre.ROLE_USER.toString()))) {
	    	log.info("user");
	    	jacksonValue.setSerializationView(Views.User.class);
	    }else {
	    	log.info(authentication.getAuthorities().toString());
	    }

	    return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
	}
		
		
	
	
	@GetMapping("/encuesta/answer/{surveyname}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> surveyuserParticipantRequestSurvey(@PathVariable("surveyname") String surveyname, Authentication authentication) {
		if(surveyService.canUserStartSurvey(authentication.getName(),surveyname)) {
			MappingJacksonValue jacksonValue = new MappingJacksonValue(surveyService.findBySurveyName(surveyname));
			jacksonValue.setSerializationView(Views.User.class);
			return new ResponseEntity(jacksonValue, HttpStatus.OK);
		}
		
		
	return new ResponseEntity(new Mensaje("No puedes iniciar porque la encuesta se encuentra expirada o inactiva"), HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/encuestaca/{role}")
	public ResponseEntity<MappingJacksonValue>  getEmployee(@PathVariable String role) {
		List<Survey> surveys=surveyService.findAll();
		    MappingJacksonValue jacksonValue = new MappingJacksonValue(surveys);

		    if (role.equals("MANAGER")) {
		        jacksonValue.setSerializationView(Views.Admin.class);
		    } else if (role.equals("EMPLOYEE")) {
		    	jacksonValue.setSerializationView(Views.User.class);
		    }

		    return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
		}
}

