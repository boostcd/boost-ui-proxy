package com.estafet.boostcd.proxy.api.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EnvironmentDTO {

	private String name;
	private String displayName;
	private String updatedDate;
	private Boolean tested;
	private String indicatorColour;
	
	private EnvironmentActionsDTO actions;
	private EnvironmentStateDTO state;

	private List<FeatureDTO> features = new ArrayList<FeatureDTO>();
	private List<MicroserviceDTO> apps = new ArrayList<MicroserviceDTO>();

	public void addFeature(FeatureDTO feature) {
		features.add(feature);
	}

	public void addMicroservice(MicroserviceDTO microservice) {
		apps.add(microservice);
	}

	public String getIndicatorColour() {
		return indicatorColour;
	}

	public void setIndicatorColour(String indicatorColour) {
		this.indicatorColour = indicatorColour;
	}

	public List<MicroserviceDTO> getApps() {
		return apps;
	}

	public void setApps(List<MicroserviceDTO> apps) {
		this.apps = apps;
	}

	public List<FeatureDTO> getFeatures() {
		return features;
	}

	public void setFeatures(List<FeatureDTO> features) {
		this.features = features;
	}

	public EnvironmentStateDTO getState() {
		return state;
	}

	public void setState(EnvironmentStateDTO state) {
		this.state = state;
	}

	public EnvironmentActionsDTO getActions() {
		return actions;
	}

	public void setActions(EnvironmentActionsDTO actions) {
		this.actions = actions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getTested() {
		return tested;
	}

	public void setTested(Boolean tested) {
		this.tested = tested;
	}

}
