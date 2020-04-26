package com.xworkz.river.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="rivTable")
public class RiverDTO implements Serializable 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment") 
	Long id;
	
	
	@Column(name="River_Name")
	String riverName;
	
	@Column(name="River_Length")
	long riverLength;
	
	@Column(name="River_origin")
	String origin;

	public String getRiverName() {
		return riverName;
	}

	public void setRiverName(String riverName) {
		this.riverName = riverName;
	}

	public long getRiverLength() {
		return riverLength;
	}

	public void setRiverLength(long riverLength) {
		this.riverLength = riverLength;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	
	
	
	
	

}
