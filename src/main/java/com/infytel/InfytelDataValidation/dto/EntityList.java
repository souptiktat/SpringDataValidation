package com.infytel.InfytelDataValidation.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@XmlRootElement
@XmlSeeAlso({ PlanDTO.class })
@NoArgsConstructor
@AllArgsConstructor
public class EntityList<T> {

	private List<T> listOfEntityObjects;
	
	@XmlAnyElement
	public List<T> getItems() {
		return listOfEntityObjects;
	}
}
