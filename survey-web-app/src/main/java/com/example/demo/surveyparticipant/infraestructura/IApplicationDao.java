package com.example.demo.surveyparticipant.infraestructura;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;

public interface IApplicationDao extends CrudRepository<Application,Integer> {
    List<Application> findAll();
}
