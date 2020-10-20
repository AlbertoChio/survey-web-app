package com.example.demo.rol.infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.rol.dominio.Rol;
import com.example.demo.rol.dominio.RolNombre;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    Optional<Rol> findByRolNombre(String rolName);
}
