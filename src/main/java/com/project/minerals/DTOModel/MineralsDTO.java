package com.project.minerals.DTOModel;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

public class MineralsDTO {
   
	@NotBlank
	@NotNull
 	private String nome;
	
	@NotBlank
	@NotNull
	private String categoria;
	
	@NotBlank
	@NotNull
	private String cor;
	
	@NotBlank
	@NotNull
	private String formulaQuimica;
	
	@NotBlank
	@NotNull
	private String classificacao;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<CristalografiaDTO> cristalografias;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<PropriedadesfisicasDTO> propriedadesfisicas;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<PropriedadesOpticasDTO> propriedadesOpticas;
	
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
	public List<CristalografiaDTO> getCristalografias() {
		return cristalografias;
	}
	public void setCristalografias(List<CristalografiaDTO> cristalografias) {
		this.cristalografias = cristalografias;
	}
	public List<PropriedadesfisicasDTO> getPropriedadesfisicas() {
		return propriedadesfisicas;
	}
	public void setPropriedadesfisicas(List<PropriedadesfisicasDTO> propriedadesfisicas) {
		this.propriedadesfisicas = propriedadesfisicas;
	}
	public List<PropriedadesOpticasDTO> getPropriedadesOpticas() {
		return propriedadesOpticas;
	}
	public void setPropriedadesOpticas(List<PropriedadesOpticasDTO> propriedadesOpticas) {
		this.propriedadesOpticas = propriedadesOpticas;
	}

}
