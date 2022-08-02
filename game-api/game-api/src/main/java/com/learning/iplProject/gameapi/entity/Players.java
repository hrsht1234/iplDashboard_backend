package com.learning.iplProject.gameapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Players {
	
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 

	 
	@ManyToOne
	public Country country;
	 public String name;
	

}
