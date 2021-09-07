package com.project.minerals.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.minerals.DTOModel.CristalografiaDTO;
import com.project.minerals.model.Cristalografia;
import com.project.minerals.repository.CristalografiaRepository;

@Service
public class ServiceCristalografia {
  
	 private CristalografiaRepository cristalografiaRepository;
	 private ModelMapper modelMapper;
	 
	 public ServiceCristalografia(CristalografiaRepository cristalografiaRepository, ModelMapper modelMapper) {
		 this.cristalografiaRepository = cristalografiaRepository;
		 this.modelMapper = modelMapper;
	}
	 
	public ResponseEntity<CristalografiaDTO> saveCristalo(CristalografiaDTO cristalografiaDTO){
		Cristalografia salvandoEntity = saveConverter(modelMapper.map(cristalografiaDTO, Cristalografia.class));
		return ResponseEntity
				        .status(HttpStatus.CREATED)
				        .body(modelMapper.map(salvandoEntity, CristalografiaDTO.class));
	}
	
	public Cristalografia saveConverter(Cristalografia cristalografia) {
		return cristalografiaRepository.save(cristalografia);
	}
	
	
	
}
