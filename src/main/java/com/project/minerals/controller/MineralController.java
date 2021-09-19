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

import com.project.minerals.DTOModel.MineralsDTO;
import com.project.minerals.model.Mineral;
import com.project.minerals.service.ServiceMineral;

@RestController
@RequestMapping("/api/v1/minerais/mineral/")
public class MineralController {
   
	private ServiceMineral serviceMineral;

	public MineralController(ServiceMineral serviceMineral) {
		this.serviceMineral = serviceMineral;
	}
	
	@PostMapping
	public ResponseEntity<MineralsDTO> save(@RequestBody @Valid MineralsDTO mineralsDto){
		return  serviceMineral.saveMineral(mineralsDto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MineralsDTO> list(@PathVariable Long id) {
		return serviceMineral.listMineral(id);
	}
	
	@GetMapping("categoria/{categoria}")
	public ResponseEntity<MineralsDTO> listCategoria(@PathVariable String categoria) {
		return serviceMineral.ListCategoria(categoria);
	}
	
	@GetMapping("classificacao/{classificacao}")
	public ResponseEntity<MineralsDTO> listClassificacao(@PathVariable String classificacao) {
		return serviceMineral.ListcClassificacao(classificacao);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<MineralsDTO> update(@PathVariable Long id, @RequestBody Mineral mineral){
		return serviceMineral.updateMinerals(id, mineral);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Mineral> delete(@PathVariable Long id) {
		return serviceMineral.deleteMinerals(id);
	}
}












