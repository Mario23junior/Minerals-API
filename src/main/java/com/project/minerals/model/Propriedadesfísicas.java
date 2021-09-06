package com.project.minerals.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Propriedadesfísicas {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String pesoEspecifico;
	private Integer dureza;
	private String pontoDeFusao;
	private String cilvagem;
	private String fratura;
	private String Brilho;
	private String tenacidade;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
