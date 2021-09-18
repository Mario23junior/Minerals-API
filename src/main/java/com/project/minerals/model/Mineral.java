package com.project.minerals.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mineral {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String categoria;
	private String cor;
	private String formulaQuimica;
	private String classificacao;
	
	@OneToMany(mappedBy = "mineral")
	private List<Cristalografia> cristalografias;
	
	@OneToMany(mappedBy = "mineral")
	private List<Propriedadesfisicas> propriedadesfisicas;
	
	@OneToMany(mappedBy = "mineral")
	private List<PropriedadesOpticas> propriedadesOpticas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFormulaQuimica() {
		return formulaQuimica;
	}
	public void setFormulaQuimica(String formulaQuimica) {
		this.formulaQuimica = formulaQuimica;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public List<Cristalografia> getCristalografias() {
		return cristalografias;
	}
	public void setCristalografias(List<Cristalografia> cristalografias) {
		this.cristalografias = cristalografias;
	}
	public List<Propriedadesfisicas> getPropriedadesfisicas() {
		return propriedadesfisicas;
	}
	public void setPropriedadesfisicas(List<Propriedadesfisicas> propriedadesfisicas) {
		this.propriedadesfisicas = propriedadesfisicas;
	}
	public List<PropriedadesOpticas> getPropriedadesOpticas() {
		return propriedadesOpticas;
	}
	public void setPropriedadesOpticas(List<PropriedadesOpticas> propriedadesOpticas) {
		this.propriedadesOpticas = propriedadesOpticas;
	}	
}
