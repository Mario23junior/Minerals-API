package com.project.minerals.serviceTeste;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.project.minerals.model.Cristalografia;
import com.project.minerals.repository.CristalografiaRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class TesteServiceCristalografia {
   
	@Autowired
	private CristalografiaRepository cristalografiaRepository;
	 	
	@Test
	@DisplayName("Testando salvamento dos dados no banco de dados")
	public void save() {
		
		//Cenario
		Cristalografia cristalografia = new Cristalografia();
		cristalografia.setId(1L);
		cristalografia.setSistemaCristalino("Trigonal");
		cristalografia.setParticao("romboédrica");
		cristalografia.setDiafaneidade("Opaco,Transparente");
		cristalografia.setHabitoCristalino("hexagonal");
	
		//acao
		cristalografiaRepository.save(cristalografia);
				
		// verificacao
 		 
        }
	
	@Test
	@DisplayName("testando listagem de dados cadastrados no banco")
	public void ListId() {
		
		Cristalografia cristalografia = new Cristalografia();
		cristalografia.setId(1L);
		cristalografia.setSistemaCristalino("Trigonal");
		cristalografia.setParticao("romboédrica");
		cristalografia.setDiafaneidade("Opaco,Transparente");
		cristalografia.setHabitoCristalino("hexagonal");
				
		cristalografiaRepository.findById(cristalografia.getId());
	}
}
