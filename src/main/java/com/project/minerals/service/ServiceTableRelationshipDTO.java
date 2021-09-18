package com.project.minerals.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.minerals.DTOModel.MineralsDTO;
import com.project.minerals.model.Mineral;
import com.project.minerals.repository.MineralsRepository;

@Service
public class ServiceTableRelationshipDTO {
  
	private MineralsRepository mineralsRepository;
	private ModelMapper modelMapper;
	
	public ServiceTableRelationshipDTO(MineralsRepository mineralsRepository, ModelMapper modelMapper) {
		this.mineralsRepository = mineralsRepository;
		this.modelMapper = modelMapper;
	}
	
	public List<MineralsDTO> ListAll() {
		return ((List<Mineral>) mineralsRepository
				      .findAll())
				      .stream()
				      .map(this::converterEntidade)
				      .collect(Collectors.toList());  
	}
	
	private MineralsDTO converterEntidade(Mineral mineral) {
		MineralsDTO mineralsConvert = modelMapper.map(mineral, MineralsDTO.class);
		return mineralsConvert;
	}
	
	public List<MineralsDTO> listAllInformation() {
		List<MineralsDTO> list = ListAll();
		return list
				 .stream()
				 .collect(Collectors.toList());
	}
}


































