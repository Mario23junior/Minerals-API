package com.project.minerals.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PropriedadesOpticas {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String birrefringencia;
	private String pleocroismo;
	private String sistema;
	private String formula;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBirrefringencia() {
		return birrefringencia;
	}
	public void setBirrefringencia(String birrefringencia) {
		this.birrefringencia = birrefringencia;
	}
	public String getPleocroismo() {
		return pleocroismo;
	}
	public void setPleocroismo(String pleocroismo) {
		this.pleocroismo = pleocroismo;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	
	
}
