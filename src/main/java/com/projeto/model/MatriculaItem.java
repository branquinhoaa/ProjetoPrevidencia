package com.projeto.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "matricula_item")
public class MatriculaItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private BigDecimal salario;
	
	@ManyToOne
	private Matricula matricula;
	

	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_inicio_contribuicao")
	private Date dataInicioContribuicao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_fim_contribuicao")
	private Date dataFimContribuicao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	
	public Date getDataInicioContribuicao() {
		return dataInicioContribuicao;
	}

	public void setDataInicioContribuicao(Date dataInicioContribuicao) {
		this.dataInicioContribuicao = dataInicioContribuicao;
	}

	public Date getDataFimContribuicao() {
		return dataFimContribuicao;
	}

	public void setDataFimContribuicao(Date dataFimContribuicao) {
		this.dataFimContribuicao = dataFimContribuicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatriculaItem other = (MatriculaItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
   
}