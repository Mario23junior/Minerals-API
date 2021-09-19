package com.project.minerals.DTOModel;

import javax.validation.constraints.NotBlank;

public class CristalografiaDTO {
    
	@NotBlank
 	private String sistemaCristalino;
	
	@NotBlank
	private String HabitoCristalino;
	
	@NotBlank
	private String particao;
	
	@NotBlank
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
