package com.example.demo.rol.infraestructura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.rol.dominio.Rol;
import com.example.demo.rol.dominio.RolNombre;

import java.util.Optional;

@Service
@Transactional
public class RolService{

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    public Optional<Rol> getByRolNombre(String rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
