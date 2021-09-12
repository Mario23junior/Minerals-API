package com.project.minerals.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.minerals.DTOModel.MineralsDTO;
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
		return mineralsRepository.save(mineral);
	}
}
