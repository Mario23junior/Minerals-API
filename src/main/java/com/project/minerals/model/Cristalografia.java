package com.project.minerals.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cristalografia {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String sistemaCristalino;
	private String HabitoCristalino;
	private String particao;
	private String diafaneidade;
	
	@ManyToOne
	private Mineral mineral;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Mineral getMineral() {
		return mineral;
	}
	public void setMineral(Mineral mineral) {
		this.mineral = mineral;
	}
}
