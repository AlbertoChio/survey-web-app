package com.example.demo.surveyparticipant.infraestructura;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.dtos.NewAnswerDto;

@Service
public class ApplicationServiceImpl implements IApplicationService {

	@Autowired
	private IApplicationDao applicationDao;
	
	@Override
	public Application save(Application application) {
		return applicationDao.save(application);
	}

	@Override
	public List<Application> findAll() {
		return applicationDao.findAll();
	}

	@Override
	public List<NewAnswerDto> aplicationToNewAnswerDto(List<Application> applications) {
        List<NewAnswerDto> newAnswerDto = applications.stream().map(temp -> {
        	NewAnswerDto p = new NewAnswerDto(temp.getSegmentationitems(),temp.getApplicationHasQuestions());
      return p;
        }).collect(Collectors.toList());
                
		return newAnswerDto;
	}
	

}
