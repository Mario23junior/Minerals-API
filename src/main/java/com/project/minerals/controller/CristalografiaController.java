package com.project.minerals.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.minerals.DTOModel.CristalografiaDTO;
import com.project.minerals.service.ServiceCristalografia;

@RestController
@RequestMapping("/api/v1/minerais/cristalografia/")
public class CristalografiaController {
   
	private ServiceCristalografia serviceCristalografia;
	
	public CristalografiaController(ServiceCristalografia serviceCristalografia) {
		this.serviceCristalografia = serviceCristalografia;
 	}
	
	@PostMapping
	public ResponseEntity<CristalografiaDTO> save(@RequestBody CristalografiaDTO cristalografiaDTO) {
		return serviceCristalografia.saveCristalo(cristalografiaDTO);
	}
}