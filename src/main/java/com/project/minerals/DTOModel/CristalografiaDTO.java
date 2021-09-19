package com.project.minerals.DTOModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CristalografiaDTO {
    
	@NotBlank
	@NotNull
 	private String sistemaCristalino;
	
	@NotBlank
	@NotNull
	private String HabitoCristalino;
	
	@NotBlank
	@NotNull
	private String particao;
	
	@NotBlank
	@NotNull
	private String diafaneidade;
	

	public String getSistemaCristalino() {
		return sistemaCristalino;
	}
	public void setSistemaCristalino(String sistemaCristalino) {
		this.sistemaCristalino = sistemaCristalino;
	}
	public String getHabitoCristalino() {
		return HabitoCristalino;
	}
	public void setHabitoCristalino(String habitoCristalino) {
		HabitoCristalino = habitoCristalino;
	}
	public String getParticao() {
		return particao;
	}
	public void setParticao(String particao) {
		this.particao = particao;
	}
	public String getDiafaneidade() {
		return diafaneidade;
	}
	public void setDiafaneidade(String diafaneidade) {
		this.diafaneidade = diafaneidade;
	}
}
