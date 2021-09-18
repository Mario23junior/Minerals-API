package com.project.minerals.ControllerDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.minerals.DTOModel.MineralsDTO;
import com.project.minerals.service.ServiceTableRelationshipDTO;

@RestController
@RequestMapping("/api/v1/geo/minerais/")
public class ControllerEntityDTO {

	private ServiceTableRelationshipDTO serviceTableRelation;
	
	public ControllerEntityDTO(ServiceTableRelationshipDTO serviceTableRelation) {
		this.serviceTableRelation = serviceTableRelation;
	}
	
	@GetMapping
	public List<MineralsDTO> list() {
		return serviceTableRelation.listAllInformation();
	}
}
