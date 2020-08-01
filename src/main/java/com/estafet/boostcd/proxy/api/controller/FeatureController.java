package com.estafet.boostcd.proxy.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.estafet.boostcd.proxy.api.dto.EnvironmentDTO;
import com.estafet.boostcd.proxy.api.util.ENV;

@RestController
public class FeatureController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/features")
	public List<EnvironmentDTO> getFeatureEnvironments() {
		return Arrays.asList(
				restTemplate.getForObject(ENV.GATEWAY_API + "/features/" + ENV.PRODUCT, EnvironmentDTO[].class));
	}

}
