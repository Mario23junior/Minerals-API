package com.project.minerals.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.minerals.model.Propriedadesfisicas;

 
public interface PropriedadesfisicasRepository extends JpaRepository<Propriedadesfisicas, Long> {
	
	Propriedadesfisicas findByTenacidade (String tenacidade);
 
	
	

}
