package com.project.minerals.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.minerals.model.Mineral;

public interface MineralsRepository extends JpaRepository<Mineral, Long> { 
    
	 Mineral findByNome (String Nome);
}
