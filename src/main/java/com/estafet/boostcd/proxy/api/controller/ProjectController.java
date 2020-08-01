package com.estafet.boostcd.proxy.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.estafet.boostcd.proxy.api.dto.ProjectDTO;
import com.estafet.boostcd.proxy.api.model.Project;
import com.estafet.boostcd.proxy.api.util.ENV;

@RestController
public class ProjectController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/projects")
	public List<ProjectDTO> getProjects() {
		return Arrays
				.asList(restTemplate.getForObject(ENV.GATEWAY_API + "/projects/" + ENV.PRODUCT, ProjectDTO[].class));
	}

	@GetMapping("/project/{namespace}")
	public ProjectDTO getProject(@PathVariable String namespace) {
		return restTemplate.getForObject(ENV.GATEWAY_API + "/project/" + ENV.PRODUCT + "/" + namespace,
				ProjectDTO.class);
	}

	@PostMapping("/project/{product}")
	public ResponseEntity<String> createProject(@RequestBody Project project) {
		return new ResponseEntity<String>(
				restTemplate.postForObject(ENV.GATEWAY_API + "/project/" + ENV.PRODUCT, null, String.class),
				HttpStatus.OK);
	}

	@DeleteMapping("/project/{project}")
	public ResponseEntity<String> deleteProject(@PathVariable String project) {
		return new ResponseEntity<String>(
				restTemplate.exchange(ENV.GATEWAY_API + "/project/" + ENV.PRODUCT + "/" + project, HttpMethod.DELETE,
						null, String.class).getBody(),
				HttpStatus.OK);
	}

	@PutMapping("/project/{namespace}")
	public ResponseEntity<String> editProject(@PathVariable String product, @PathVariable String namespace,
			@RequestBody Project project) {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Project> entity = new HttpEntity<Project>(project, headers);
		return new ResponseEntity<String>(restTemplate
				.exchange(ENV.GATEWAY_API + "/project/{namespace}", HttpMethod.PUT, entity, String.class, namespace)
				.getBody(), HttpStatus.OK);
	}

}
