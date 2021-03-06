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

import com.project.minerals.DTOModel.CristalografiaDTO;
import com.project.minerals.model.Cristalografia;
import com.project.minerals.service.ServiceCristalografia;

@RestController
@RequestMapping("/api/v1/minerais/cristalografia/")
public class CristalografiaController {
   
	private ServiceCristalografia serviceCristalografia;
	
	public CristalografiaController(ServiceCristalografia serviceCristalografia) {
		this.serviceCristalografia = serviceCristalografia;
 	}
	
	@PostMapping
	public ResponseEntity<CristalografiaDTO> save(@RequestBody @Valid CristalografiaDTO cristalografiaDTO) {
		return serviceCristalografia.saveCristalo(cristalografiaDTO);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CristalografiaDTO> list(@PathVariable Long id) {
		return serviceCristalografia.listCristalo(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CristalografiaDTO> update(@PathVariable Long id, @Valid @RequestBody Cristalografia cristalografia) {
		return serviceCristalografia.updateCristalo(id, cristalografia);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cristalografia> delete(@PathVariable Long id) {
		return serviceCristalografia.deleteCristalo(id);
	}
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
