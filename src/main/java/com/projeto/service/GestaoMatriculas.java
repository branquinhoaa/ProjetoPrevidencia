package com.projeto.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.projeto.model.Matricula;
import com.projeto.repository.MatriculasRepository;
import com.projeto.util.Transacional;

public class GestaoMatriculas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private MatriculasRepository matriculas;
	
	@Transacional
	public void salvar(Matricula matricula) {
		matriculas.guardar(matricula);
	}
	
}