package com.estafet.boostcd.proxy.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MicroserviceDTO {

	private String version;
	private String name;
	private String deployedDate;
	private boolean deployed;
	private Boolean tested;

	private MicroserviceActionsDTO actions;
	private MicroserviceStateDTO state;
	
	public Boolean getTested() {
		return tested;
	}

	public void setTested(Boolean tested) {
		this.tested = tested;
	}

	public MicroserviceStateDTO getState() {
		return state;
	}

	public void setState(MicroserviceStateDTO state) {
		this.state = state;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeployedDate() {
		return deployedDate;
	}

	public void setDeployedDate(String deployedDate) {
		this.deployedDate = deployedDate;
	}

	public boolean isDeployed() {
		return deployed;
	}

	public void setDeployed(boolean deployed) {
		this.deployed = deployed;
	}

	public MicroserviceActionsDTO getActions() {
		return actions;
	}

	public void setActions(MicroserviceActionsDTO actions) {
		this.actions = actions;
	}

}
