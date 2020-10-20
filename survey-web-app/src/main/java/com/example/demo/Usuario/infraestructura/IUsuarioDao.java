
package com.example.demo.Usuario.infraestructura;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Usuario.dominio.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Integer> {
    Optional<Usuario> findByUsername(String nombreUsuario);
    boolean existsByUsername(String nombreUsuario);
    boolean existsByEmail(String email);
    List<Usuario> findAll();

}