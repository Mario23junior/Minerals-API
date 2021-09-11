package com.project.minerals.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.minerals.DTOModel.CristalografiaDTO;
import com.project.minerals.Exceptions.ValidatingDuplicateValues;
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
		ExceptionDuplicateData(cristalografia);
		return cristalografiaRepository.save(cristalografia);
	}
	
	public void ExceptionDuplicateData(Cristalografia cristalografia) {
		Cristalografia findData = cristalografiaRepository.findBySistemaCristalino(cristalografia.getSistemaCristalino());
		if(findData != null && findData.getId() != cristalografia.getId()) {
			throw new ValidatingDuplicateValues(String.format("Sistema %s já cadastrado no banco de dados", cristalografia.getSistemaCristalino()));
		}
	}
		
	public ResponseEntity <CristalografiaDTO> listCristalo(Long id) {
	    Optional <Cristalografia> listIdInfo = cristalografiaRepository.findById(id);
	    if (listIdInfo.isPresent()) {
	        return ResponseEntity.ok(modelMapper.map(listIdInfo.get(), CristalografiaDTO.class));
	    } else {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	}
	 
 
	public ResponseEntity<CristalografiaDTO> updateCristalo(Long id, Cristalografia cristalografia) {
		ExceptionDuplicateData(cristalografia);
		Optional<Cristalografia> listInfo = cristalografiaRepository.findById(id);
		if(listInfo.isPresent()) {
 			Cristalografia cristaloInstace = listInfo.get();
 			cristaloInstace.setId(cristalografia.getId());
 			cristaloInstace.setSistemaCristalino(cristalografia.getSistemaCristalino());
 			cristaloInstace.setParticao(cristalografia.getParticao());
 			cristaloInstace.setDiafaneidade(cristalografia.getParticao());
 			cristaloInstace.setHabitoCristalino(cristalografia.getHabitoCristalino());
 		 
 		   
 			cristalografiaRepository.save(cristaloInstace);
 			return ResponseEntity.ok(modelMapper.map(cristaloInstace, CristalografiaDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
}

