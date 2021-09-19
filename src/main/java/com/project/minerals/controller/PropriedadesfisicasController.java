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

import com.project.minerals.DTOModel.PropriedadesfisicasDTO;
import com.project.minerals.model.Propriedadesfisicas;
import com.project.minerals.service.ServicePropriedadesfisicas;

@RestController
@RequestMapping("/api/v1/minerais/propriedadesFisicas")
public class PropriedadesfisicasController {
  
	private ServicePropriedadesfisicas servicePropriedadesfisicas;
	
	public PropriedadesfisicasController(ServicePropriedadesfisicas servicePropriedadesfisicas) {
		this.servicePropriedadesfisicas = servicePropriedadesfisicas;
	}
	
	@PostMapping
	public ResponseEntity<PropriedadesfisicasDTO> save (@RequestBody @Valid PropriedadesfisicasDTO proDto){
		return servicePropriedadesfisicas.savePropriedadeFisica(proDto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PropriedadesfisicasDTO> list (@PathVariable Long id) {
		return servicePropriedadesfisicas.list(id);
	}
	
	@GetMapping("tenacidade/{tenacidade}")
	public ResponseEntity<PropriedadesfisicasDTO> listPorTenacidade(@PathVariable String tenacidade) {
		return servicePropriedadesfisicas.listByTenacidade(tenacidade);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PropriedadesfisicasDTO> updateMinerals(@RequestBody  @Valid Propriedadesfisicas propriedadesfisicas, @PathVariable Long id) { 
		return servicePropriedadesfisicas.updatePropriedade(id, propriedadesfisicas);	
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Propriedadesfisicas> delete(@PathVariable Long id) {
		return servicePropriedadesfisicas.deletePropriedade(id);
	}
	
}
