package com.project.minerals.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.minerals.DTOModel.PropriedadesfisicasDTO;
import com.project.minerals.Exceptions.ValidatingDuplicateValues;
import com.project.minerals.model.Propriedadesfisicas;
import com.project.minerals.repository.PropriedadesfisicasRepository;

@Service
public class ServicePropriedadesfisicas {
    
	private ModelMapper modelMapper;
	private PropriedadesfisicasRepository propriedadesfisicasRepository;
	
	public ServicePropriedadesfisicas(ModelMapper modelMapper, PropriedadesfisicasRepository propriedadesfisicasRepository) {
		 this.modelMapper = modelMapper;
		 this.propriedadesfisicasRepository = propriedadesfisicasRepository;
	}
	
 		public ResponseEntity<PropriedadesfisicasDTO> savePropriedadeFisica(PropriedadesfisicasDTO propriedadesfisicasDTO) {
			Propriedadesfisicas save = saveConverter(modelMapper.map(propriedadesfisicasDTO, Propriedadesfisicas.class));
			return ResponseEntity
					       .status(HttpStatus.CREATED)
					       .body(modelMapper.map(save, PropriedadesfisicasDTO.class));
		}
 		
 		public Propriedadesfisicas saveConverter(Propriedadesfisicas propriedadesfisicas) {
 			ExceptionDuplicateDataPropriedadesfisicas(propriedadesfisicas);
 			return propriedadesfisicasRepository.save(propriedadesfisicas);
 		}
 		
 		public void ExceptionDuplicateDataPropriedadesfisicas(Propriedadesfisicas propriedadesfisicas) {
 			Propriedadesfisicas findInfo = propriedadesfisicasRepository.findByTenacidade (propriedadesfisicas.getTenacidade());
 			if(findInfo != null && findInfo.getId() != propriedadesfisicas.getId()) {
 				throw new ValidatingDuplicateValues(String.format(" Informações já cadastrado no banco de dados por favor insira um novo cadastro"));
 			}
 		}
 		
 		
 		public ResponseEntity<PropriedadesfisicasDTO> list (Long id) {
 			Optional<Propriedadesfisicas> findId = propriedadesfisicasRepository.findById(id);
 			if(findId.isPresent()) {
 				return ResponseEntity.ok(modelMapper.map(findId.get(), PropriedadesfisicasDTO.class));
 			} else {
 				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
 			}
 		}
 		
 		
 		public ResponseEntity<PropriedadesfisicasDTO> listByTenacidade(String tenacidade) {
 			Optional<Propriedadesfisicas> listData = propriedadesfisicasRepository.findByTenacidadeIgnoreCaseContaining(tenacidade);
 			if(listData.isPresent()) {
 				return ResponseEntity.ok(modelMapper.map(listData.get(), PropriedadesfisicasDTO.class));
 			} else {
 				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
 			}
 		}
 	
 		public ResponseEntity<PropriedadesfisicasDTO> updatePropriedade(Long id, Propriedadesfisicas propriedadesfisicas) {
 		   ExceptionDuplicateDataPropriedadesfisicas(propriedadesfisicas);
 		   Optional<Propriedadesfisicas> listaData = propriedadesfisicasRepository.findById(id);
 		   if(listaData.isPresent()) {
 			  Propriedadesfisicas propriedades = listaData.get();
 			  propriedades.setPesoEspecifico(propriedadesfisicas.getPesoEspecifico());
 			  propriedades.setDureza(propriedadesfisicas.getDureza());
 			  propriedades.setPontoDeFusao(propriedadesfisicas.getPontoDeFusao());
 			  propriedades.setCilvagem(propriedadesfisicas.getCilvagem());
 			  propriedades.setFratura(propriedadesfisicas.getFratura());
 			  propriedades.setBrilho(propriedadesfisicas.getBrilho());
 			  propriedades.setTenacidade(propriedadesfisicas.getTenacidade());
 			  
 			  propriedadesfisicasRepository.save(propriedades);
 			  return ResponseEntity.ok(modelMapper.map(propriedades, PropriedadesfisicasDTO.class));
 		   } else {
 			   return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
 		   }
 	   
 		}
 		
 		public ResponseEntity<Propriedadesfisicas> deletePropriedade(Long id) {
 				Optional<Propriedadesfisicas> deleteList = propriedadesfisicasRepository.findById(id);
 				if(deleteList.isPresent()) {
 				     propriedadesfisicasRepository.delete(deleteList.get());
 					 return new ResponseEntity<>(HttpStatus.OK);
 				} else {
 					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
 				}
 			} 		
	}