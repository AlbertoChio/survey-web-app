package com.example.demo.security.dominio.dtos;

import java.util.HashSet;
import java.util.Set;



public class NuevosUsuarios {
	
	private Set<NuevoUsuario> usuarios = new HashSet<NuevoUsuario>(0);

	public NuevosUsuarios(Set<NuevoUsuario> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	/**
	 * @return the usuarios
	 */
	public Set<NuevoUsuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(Set<NuevoUsuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
