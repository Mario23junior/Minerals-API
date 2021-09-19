package com.project.minerals.DTOModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PropriedadesOpticasDTO {
   
	@NotBlank
	@NotNull
	private String birrefringencia;
	
	@NotBlank
	@NotNull
	private String pleocroismo;
	
	@NotBlank
	@NotNull
	private String sistema;
	
	@NotBlank
	@NotNull
	private String formula;
	
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
