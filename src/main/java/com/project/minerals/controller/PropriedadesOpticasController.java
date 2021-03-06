package com.project.minerals.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.minerals.DTOModel.PropriedadesOpticasDTO;
import com.project.minerals.model.PropriedadesOpticas;
import com.project.minerals.service.ServicePropriedadesOpticas;

@RestController
@RequestMapping("/api/v1/minerais/propriedadesOpticas/")
public class PropriedadesOpticasController {

	 private ServicePropriedadesOpticas servicePropriedadesOpticas;
	 
	 public PropriedadesOpticasController(ServicePropriedadesOpticas servicePropriedadesOpticas) {
		this.servicePropriedadesOpticas = servicePropriedadesOpticas;
	}
	
	 @PostMapping
	 public ResponseEntity<PropriedadesOpticasDTO> save(@RequestBody @Valid PropriedadesOpticasDTO propriedadesOpticasDto) {
		 return servicePropriedadesOpticas.savePropriedadesfisicas(propriedadesOpticasDto);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<PropriedadesOpticasDTO> list(@PathVariable Long id) {
		 return servicePropriedadesOpticas.listPropriedadesfisicas(id);
	 }
	 
	 @GetMapping("sistema/{sistema}")
	 public ResponseEntity<PropriedadesOpticasDTO> listSistema (@PathVariable String sistema) {
		 return servicePropriedadesOpticas.listBySistema(sistema);
	 }
	 
	 @PutMapping("/{id}")
	 public ResponseEntity<PropriedadesOpticasDTO> update (@PathVariable Long id, @RequestBody  @Valid PropriedadesOpticas propriedadesOpticas) {
		 return servicePropriedadesOpticas.updatePropriedadesOpticas(id, propriedadesOpticas);
	 }
	 
	 @DeleteMapping("/{id}")
	 public ResponseEntity<PropriedadesOpticas> delete(@PathVariable Long id) {
		 return servicePropriedadesOpticas.deletePropriedadeOpti(id);
	 }
	 
	 
	 
	 
}
