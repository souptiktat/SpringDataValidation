package com.infytel.InfytelDataValidation.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString 
public class CallDetailsDTO {

	long calledBy;
	long calledTo;
	LocalDate calledOn;
	int duration;
}
