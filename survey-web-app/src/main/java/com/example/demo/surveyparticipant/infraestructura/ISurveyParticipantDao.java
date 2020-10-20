
package com.example.demo.surveyparticipant.infraestructura;


import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.survey.dominio.Survey;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;


public interface ISurveyParticipantDao extends CrudRepository<Surveyparticipant,Integer> {
    List<Surveyparticipant> findAll();
    List<Surveyparticipant> findByUsuarioUsername(String username);
    Surveyparticipant findByUsuarioUsernameAndSurveySurveyName(String username,String surveyname);
    
    
}