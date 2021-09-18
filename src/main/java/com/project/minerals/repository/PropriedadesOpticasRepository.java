package com.project.minerals.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.minerals.model.PropriedadesOpticas;
 

public interface PropriedadesOpticasRepository extends JpaRepository<PropriedadesOpticas, Long>{

	PropriedadesOpticas findByFormula(String formula);

}
