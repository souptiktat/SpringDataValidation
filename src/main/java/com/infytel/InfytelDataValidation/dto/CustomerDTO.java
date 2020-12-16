package com.infytel.InfytelDataValidation.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class CustomerDTO {

	long phoneNo;
    @NotNull(message = "Name cannot be empty")
	String name;
	@Email(message = "Email id is not in format, please check")
	String email;
	int age;
	char gender;
	List<FriendFamilyDTO> friendAndFamily;
	String password;
	String address;
	PlanDTO currentPlan;
}
