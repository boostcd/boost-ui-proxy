package com.estafet.boostcd.proxy.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.estafet.boostcd.proxy.api.dto.EnvironmentDTO;
import com.estafet.boostcd.proxy.api.dto.MicroserviceDTO;
import com.estafet.boostcd.proxy.api.util.ENV;

@RestController
public class MicroserviceController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/microservices")
	public List<EnvironmentDTO> getMicroserviceEnvironments() {
		return Arrays.asList(
				restTemplate.getForObject(ENV.GATEWAY_API + "/microservices/" + ENV.PRODUCT, EnvironmentDTO[].class));
	}

	@GetMapping("/environment/{env}/app/{app}")
	public MicroserviceDTO getMicroservice(@PathVariable String env, @PathVariable String app) {
		return restTemplate.getForObject(ENV.GATEWAY_API + "/environment/" + ENV.PRODUCT + "/" + env + "/app/" + app,
				MicroserviceDTO.class);
	}

	@PostMapping("/environment/{env}/app/{app}/{action}")
	public ResponseEntity<MicroserviceDTO> doAction(@PathVariable String env, @PathVariable String app, @PathVariable String action) {
		return new ResponseEntity<MicroserviceDTO>(
				restTemplate.postForObject(ENV.GATEWAY_API + 
				"/environment/" + ENV.PRODUCT + "/" + env + "/app/" + app + "/" + action, null, MicroserviceDTO.class), HttpStatus.OK);
	}

}
