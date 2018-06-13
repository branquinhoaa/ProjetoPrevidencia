package com.projeto.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.projeto.model.Matricula;

public class MatriculasRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public Matricula guardar(Matricula matricula) {
		return manager.merge(matricula);
	}

}