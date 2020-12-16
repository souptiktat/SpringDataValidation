package com.infytel.InfytelDataValidation.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ErrorMessage {
	
	private int errorCode;
	private String message;

}
