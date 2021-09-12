package com.project.minerals.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.minerals.repository.MineralsRepository;

@Service
public class ServiceMineral {
  
	private MineralsRepository mineralsRepository;
	private ModelMapper modelMapper;
	
	public ServiceMineral(MineralsRepository mineralsRepository, ModelMapper modelMapper) {
		this.mineralsRepository = mineralsRepository;
		this.modelMapper = modelMapper;
	}
}
