package com.project.minerals.DTOModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.project.minerals.model.Cristalografia;
import com.project.minerals.model.PropriedadesOpticas;
import com.project.minerals.model.Propriedadesfisicas;

public class MineralsDTO {
   
 	private String nome;
	private String categoria;
	private String cor;
	private String formulaQuimica;
	private String classificacao;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<Cristalografia> cristalografias;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<Propriedadesfisicas> propriedadesfisicas;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<PropriedadesOpticas> propriedadesOpticas;
	
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
