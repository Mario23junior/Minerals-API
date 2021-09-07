package com.project.minerals.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.minerals.repository.CristalografiaRepository;

@Service
public class ServiceCristalografia {
  
	 private CristalografiaRepository cristalografiaRepository;
	 private ModelMapper modelMapper;
	 
	 public ServiceCristalografia(CristalografiaRepository cristalografiaRepository, ModelMapper modelMapper) {
		 this.cristalografiaRepository = cristalografiaRepository;
		 this.modelMapper = modelMapper;
	}
	 
	
}
