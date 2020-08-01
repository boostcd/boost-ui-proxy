package com.estafet.boostcd.proxy.api.dto;

public class MicroserviceStateDTO {

	private boolean build;
	private boolean promote;

	public boolean isBuild() {
		return build;
	}

	public void setBuild(boolean build) {
		this.build = build;
	}

	public boolean isPromote() {
		return promote;
	}

	public void setPromote(boolean promote) {
		this.promote = promote;
	}
	
}
