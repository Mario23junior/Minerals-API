package com.project.minerals.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.minerals.DTOModel.MineralsDTO;
import com.project.minerals.service.ServiceMineral;

@RestController
@RequestMapping("/api/v1/minerais/mineral/")
public class MineralController {
   
	private ServiceMineral serviceMineral;

	public MineralController(ServiceMineral serviceMineral) {
		this.serviceMineral = serviceMineral;
	}
	
	@PostMapping
	public ResponseEntity<MineralsDTO> save(@RequestBody MineralsDTO mineralsDto){
		return  serviceMineral.saveMineral(mineralsDto);
	}
}
