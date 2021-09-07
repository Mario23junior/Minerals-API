package com.project.minerals.service;

import org.springframework.stereotype.Service;

import com.project.minerals.repository.CristalografiaRepository;

@Service
public class ServiceCristalografia {
  
	 private CristalografiaRepository cristalografiaRepository;
	 
	 public ServiceCristalografia(CristalografiaRepository cristalografiaRepository) {
		 this.cristalografiaRepository = cristalografiaRepository;
	}
	 
	
}
