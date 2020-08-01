package com.estafet.boostcd.proxy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.estafet.boostcd.proxy.api.dto.EnvironmentDTO;
import com.estafet.boostcd.proxy.api.util.ENV;

@RestController
public class EnvironmentController {

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/environment/{env}/{action}")
	public ResponseEntity<EnvironmentDTO> doAction(@PathVariable String env, @PathVariable String action) {
		return new ResponseEntity<EnvironmentDTO>(
				restTemplate.postForObject(ENV.GATEWAY_API + 
				"/environment/" + ENV.PRODUCT + "/" + env + "/" + action, null, EnvironmentDTO.class), HttpStatus.OK);
	}

}
