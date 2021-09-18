package com.project.minerals.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.minerals.DTOModel.PropriedadesOpticasDTO;
import com.project.minerals.service.ServicePropriedadesOpticas;

@RestController
@RequestMapping("/api/v1/minerais/propriedadesOpticas/")
public class PropriedadesOpticasController {

	 private ServicePropriedadesOpticas servicePropriedadesOpticas;
	 
	 public PropriedadesOpticasController(ServicePropriedadesOpticas servicePropriedadesOpticas) {
		this.servicePropriedadesOpticas = servicePropriedadesOpticas;
	}
	
	 @PostMapping
	 public ResponseEntity<PropriedadesOpticasDTO> save(@RequestBody PropriedadesOpticasDTO propriedadesOpticasDto) {
		 return servicePropriedadesOpticas.savePropriedadesfisicas(propriedadesOpticasDto);
	 }
}
