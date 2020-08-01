package com.estafet.boostcd.proxy.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FeatureDTO {

	private String featureId;
	private String title;
	private String description;
	private String status;
	private boolean promoted;
	private String waitingSince;
	private String url;
	private String promoteStatus;

	public String getPromoteStatus() {
		return promoteStatus;
	}

	public void setPromoteStatus(String promoteStatus) {
		this.promoteStatus = promoteStatus;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isPromoted() {
		return promoted;
	}

	public void setPromoted(boolean promoted) {
		this.promoted = promoted;
	}

	public String getWaitingSince() {
		return waitingSince;
	}

	public void setWaitingSince(String waitingSince) {
		this.waitingSince = waitingSince;
	}
	
	public static FeatureDTOBuilder builder() {
		return new FeatureDTOBuilder();
	}
	
	public static class FeatureDTOBuilder {

		private String featureId;
		private String title;
		private String description;
		private String status;
		private boolean promoted;
		private String waitingSince;
		private String url;
		private String promoteStatus;
		
		public FeatureDTOBuilder setPromoteStatus(String promoteStatus) {
			this.promoteStatus = promoteStatus;
			return this;
		}
		
		public FeatureDTOBuilder setUrl(String url) {
			this.url = url;
			return this;
		}

		public FeatureDTOBuilder setFeatureId(String featureId) {
			this.featureId = featureId;
			return this;
		}

		public FeatureDTOBuilder setTitle(String title) {
			this.title = title;
			return this;
		}

		public FeatureDTOBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		public FeatureDTOBuilder setStatus(String status) {
			this.status = status;
			return this;
		}

		public FeatureDTOBuilder setPromoted(boolean promoted) {
			this.promoted = promoted;
			return this;
		}

		public FeatureDTOBuilder setWaitingSince(String waitingSince) {
			this.waitingSince = waitingSince;
			return this;
		}
		
		public FeatureDTO build() {
			FeatureDTO dto = new FeatureDTO();
			dto.setDescription(description);
			dto.setFeatureId(featureId);
			dto.setPromoted(promoted);
			dto.setStatus(status);
			dto.setTitle(title);
			dto.setWaitingSince(waitingSince);
			dto.setUrl(url);
			dto.setPromoteStatus(promoteStatus);
			return dto;
		}
		
	}

}
