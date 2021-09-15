package com.project.minerals.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.minerals.model.Propriedadesfisicas;

 
public interface PropriedadesfisicasRepository extends JpaRepository<Propriedadesfisicas, Long> {
	
	Propriedadesfisicas findByTenacidade (String tenacidade);
	Optional<Propriedadesfisicas> findByTenacidadeIgnoreCaseContaining(String tenacidade);

 	
	

}
