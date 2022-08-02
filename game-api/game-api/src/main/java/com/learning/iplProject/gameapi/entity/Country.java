package com.learning.iplProject.gameapi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    
    @OneToMany
    @JoinColumn(name = "COUNTRY_ID")
    List<Players> players;
    @Column(nullable = false)
    private String name;

}