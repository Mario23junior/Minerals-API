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
		
	public ResponseEntity<PropriedadesOpticasDTO> listBySistema(String sistema) {
			Optional<PropriedadesOpticas> listData = propriOptRepo.findBySistemaIgnoreCaseContaining(sistema);
			if(listData.isPresent()) {
				return ResponseEntity.ok(modelMapper.map(listData.get(), PropriedadesOpticasDTO.class));
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}


	public ResponseEntity<PropriedadesOpticasDTO>  updatePropriedadesOpticas(Long id, PropriedadesOpticas propriedadesOpticas) {
		ExceptionDuplicateData(propriedadesOpticas);
		Optional<PropriedadesOpticas> listList = propriOptRepo.findById(id);
		if(listList.isPresent()){
			PropriedadesOpticas propriedadesOpt = listList.get();
			propriedadesOpt.setBirrefringencia(propriedadesOpticas.getBirrefringencia());
			propriedadesOpt.setPleocroismo(propriedadesOpticas.getPleocroismo());
			propriedadesOpt.setSistema(propriedadesOpticas.getSistema());
			
		    
			propriOptRepo.save(propriedadesOpt);
		   return ResponseEntity.ok(modelMapper.map(propriedadesOpt, PropriedadesOpticasDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<PropriedadesOpticas> deletePropriedadeOpti(Long id) {
			Optional<PropriedadesOpticas> deleteList = propriOptRepo.findById(id);
			if(deleteList.isPresent()) {
				propriOptRepo.delete(deleteList.get());
				 return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
	
	
	
}
