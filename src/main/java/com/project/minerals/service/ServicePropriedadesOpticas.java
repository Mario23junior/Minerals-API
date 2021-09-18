package com.project.minerals.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.minerals.DTOModel.PropriedadesOpticasDTO;
import com.project.minerals.Exceptions.ValidatingDuplicateValues;
import com.project.minerals.model.PropriedadesOpticas;
import com.project.minerals.repository.PropriedadesOpticasRepository;

@Service
public class ServicePropriedadesOpticas {
   
	private PropriedadesOpticasRepository propriOptRepo;
	private ModelMapper modelMapper;
	
	public ServicePropriedadesOpticas(PropriedadesOpticasRepository propriOptRepo, ModelMapper modelMapper) {
		this.propriOptRepo = propriOptRepo;
		this.modelMapper = modelMapper;
	}
	
	public ResponseEntity<PropriedadesOpticasDTO> savePropriedadesfisicas (PropriedadesOpticasDTO propriedadesOpticasDto) {
	   PropriedadesOpticas saveBody = saveEntity(modelMapper.map(propriedadesOpticasDto, PropriedadesOpticas.class));
	   return ResponseEntity
			             .status(HttpStatus.CREATED)
			             .body(modelMapper.map(saveBody, PropriedadesOpticasDTO.class));
	}
	
	public PropriedadesOpticas saveEntity(PropriedadesOpticas propriedadesOpticas) {
		ExceptionDuplicateData(propriedadesOpticas);
		return propriOptRepo.save(propriedadesOpticas);
	}
	
	public void ExceptionDuplicateData(PropriedadesOpticas propriedadesOpticas) {
		PropriedadesOpticas findData = propriOptRepo.findByFormula(propriedadesOpticas.getFormula());
		if(findData != null && findData.getId() != propriedadesOpticas.getId()) {
			throw new ValidatingDuplicateValues(String.format("informaçãoes já cadastrada por favor insira valores validos", propriedadesOpticas));
		}
	}
	
	public ResponseEntity<PropriedadesOpticasDTO> listPropriedadesfisicas (Long id) {
			Optional<PropriedadesOpticas> findId = propriOptRepo.findById(id);
			if(findId.isPresent()) {
				return ResponseEntity.ok(modelMapper.map(findId.get(), PropriedadesOpticasDTO.class));
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
		
	
	
	
	
	
}
