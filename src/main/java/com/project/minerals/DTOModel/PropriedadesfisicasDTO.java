package com.project.minerals.DTOModel;

import javax.validation.constraints.NotBlank;

public class PropriedadesfisicasDTO {
   
	@NotBlank
 	private String pesoEspecifico;
	
	@NotBlank
	private Integer dureza;
	
	@NotBlank
	private String pontoDeFusao;
	
	@NotBlank
	private String cilvagem;
	
	@NotBlank
	private String fratura;
	
	@NotBlank
	private String Brilho;
	
	@NotBlank
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
