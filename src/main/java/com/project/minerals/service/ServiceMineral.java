package com.project.minerals.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.minerals.DTOModel.MineralsDTO;
import com.project.minerals.Exceptions.ValidatingDuplicateValues;
import com.project.minerals.model.Mineral;
import com.project.minerals.repository.MineralsRepository;

@Service
public class ServiceMineral {
  
	private MineralsRepository mineralsRepository;
	private ModelMapper modelMapper;
	
	public ServiceMineral(MineralsRepository mineralsRepository, ModelMapper modelMapper) {
		this.mineralsRepository = mineralsRepository;
		this.modelMapper = modelMapper;
	}
	
	public ResponseEntity<MineralsDTO> saveMineral(MineralsDTO mineralDto) {
		Mineral save = saveConverter(modelMapper.map(mineralDto, Mineral.class));
		return ResponseEntity
				       .status(HttpStatus.CREATED)
				       .body(modelMapper.map(save, MineralsDTO.class));
	}
	
	public Mineral saveConverter(Mineral mineral) {
		ExceptionDuplicateDataMinerals(mineral);
		return mineralsRepository.save(mineral);
	}
	
	public void ExceptionDuplicateDataMinerals(Mineral mineral) {
		Mineral findInfo = mineralsRepository.findByNome(mineral.getNome());
		if(findInfo != null && findInfo.getId() != mineral.getId()) {
			throw new ValidatingDuplicateValues(String.format(" O mineral %s já cadastrado no banco de dados por favor insira um novo cadastro", mineral.getNome()));
		}
	}
	
	
	public ResponseEntity<MineralsDTO> listMineral(Long id) {
		Optional<Mineral> listMine = mineralsRepository.findById(id);
		if(listMine.isPresent()) {
			return ResponseEntity.ok(modelMapper.map(listMine.get(), MineralsDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}	
	}
	
	public ResponseEntity<MineralsDTO> ListCategoria(String categoria) {
		Optional<Mineral> listMine = mineralsRepository.findByCategoriaIgnoreCaseContaining(categoria);
		if(listMine.isPresent()) {
			return ResponseEntity.ok(modelMapper.map(listMine.get(), MineralsDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}	
	}
	
	public ResponseEntity<MineralsDTO> ListcClassificacao(String classificacao) {
		Optional<Mineral> listClasse = mineralsRepository.findByClassificacaoIgnoreCaseContaining(classificacao);
		if(listClasse.isPresent()) {
			return ResponseEntity.ok(modelMapper.map(listClasse.get(), MineralsDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}	
	}
	
	public ResponseEntity<MineralsDTO>  updateMinerals(Long id, Mineral minerals) {
		ExceptionDuplicateDataMinerals(minerals);
		Optional<Mineral> listList = mineralsRepository.findById(id);
		if(listList.isPresent()){
		   Mineral mineralsData = listList.get();
		   mineralsData.setNome(minerals.getNome());
		   mineralsData.setCategoria(minerals.getCategoria());
		   mineralsData.setCor(minerals.getCor());
		   mineralsData.setFormulaQuimica(minerals.getFormulaQuimica());
		   mineralsData.setClassificacao(minerals.getClassificacao());
		   mineralsRepository.save(mineralsData);
		   return ResponseEntity.ok(modelMapper.map(mineralsData, MineralsDTO.class));
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<Mineral> deleteMinerals(Long id) {
		Optional<Mineral> deleteList = mineralsRepository.findById(id);
		if(deleteList.isPresent()) {
		     mineralsRepository.delete(deleteList.get());
			 return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}

 

