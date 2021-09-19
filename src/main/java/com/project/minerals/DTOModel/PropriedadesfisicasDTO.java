package com.project.minerals.DTOModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PropriedadesfisicasDTO {
   
	@NotBlank
	@NotNull
 	private String pesoEspecifico;
	
	@NotBlank
	@NotNull
	private Integer dureza;
	
	@NotBlank
	@NotNull
	private String pontoDeFusao;
	
	@NotBlank
	@NotNull
	private String cilvagem;
	
	@NotBlank
	@NotNull
	private String fratura;
	
	@NotBlank
	@NotNull
	private String Brilho;
	
	@NotBlank
	@NotNull
	private String tenacidade;
	
	public String getPesoEspecifico() {
		return pesoEspecifico;
	}
	public void setPesoEspecifico(String pesoEspecifico) {
		this.pesoEspecifico = pesoEspecifico;
	}
	public Integer getDureza() {
		return dureza;
	}
	public void setDureza(Integer dureza) {
		this.dureza = dureza;
	}
	public String getPontoDeFusao() {
		return pontoDeFusao;
	}
	public void setPontoDeFusao(String pontoDeFusao) {
		this.pontoDeFusao = pontoDeFusao;
	}
	public String getCilvagem() {
		return cilvagem;
	}
	public void setCilvagem(String cilvagem) {
		this.cilvagem = cilvagem;
	}
	public String getFratura() {
		return fratura;
	}
	public void setFratura(String fratura) {
		this.fratura = fratura;
	}
	public String getBrilho() {
		return Brilho;
	}
	public void setBrilho(String brilho) {
		Brilho = brilho;
	}
	public String getTenacidade() {
		return tenacidade;
	}
	public void setTenacidade(String tenacidade) {
		this.tenacidade = tenacidade;
	}
}
