package com.infytel.InfytelDataValidation.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NoSuchCustomerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3354643511597857918L;
	
	public NoSuchCustomerException(String errors) {
		super(errors);
	}

}
