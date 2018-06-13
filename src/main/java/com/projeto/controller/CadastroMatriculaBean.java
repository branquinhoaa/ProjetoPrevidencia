package com.projeto.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.projeto.model.Matricula;
import com.projeto.model.MatriculaItem;
import com.projeto.service.GestaoMatriculas;


@Named
@ViewScoped
public class CadastroMatriculaBean implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Inject
	private GestaoMatriculas gestaoMatriculas;
	
	  private MatriculaItem item;
	  private Matricula matricula = new Matricula();
	  int cont = 0;
	  
	  public void novoItem(){
		 
		  item = new MatriculaItem();

		
	  }
	  
	  public void adicionarItem(){ 
		  matricula.getItens().add(item);
		  item.setMatricula(matricula);
		
	  }
	  
	  public int todasContribuicoes(){
	
		  return matricula.setContribuicoes(matricula.getItens().size());
	  }
	   
	  public void salvar(){
		  gestaoMatriculas.salvar(matricula);
		  
		  matricula = new Matricula();
		  
		  FacesMessage msg = new FacesMessage("Matricula salva com sucesso!");
		  FacesContext.getCurrentInstance().addMessage(null, msg);
	  }
	  
	public Matricula getMatricula() {
		return matricula;
	}

	public MatriculaItem getItem() {
		return item;
	}
	
	 
	
}
