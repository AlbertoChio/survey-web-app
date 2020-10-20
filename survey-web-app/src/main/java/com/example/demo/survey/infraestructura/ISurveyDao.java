
package com.example.demo.survey.infraestructura;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.survey.dominio.Survey;


public interface ISurveyDao extends CrudRepository<Survey,Integer> {
    List<Survey> findAll();
    Survey findBySurveyName(String surveyName);
    List<Survey> findBySurveyparticipantsUsuarioUsername (String username);
    boolean existsBySurveyName(String nombre);
    boolean existsBySurveyparticipantsUsuarioUsernameAndSurveyName(String username, String survey);
    
}