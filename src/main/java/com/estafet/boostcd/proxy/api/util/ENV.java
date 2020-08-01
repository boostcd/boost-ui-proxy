package com.estafet.boostcd.proxy.api.util;

public final class ENV {

	private ENV( ) {}
		
	public static final String GATEWAY_API = System.getenv("GATEWAY_API_SERVICE_URI");
	public static final String PRODUCT = System.getenv("PRODUCT");

}
