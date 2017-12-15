/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuiss_1071.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author PC35
 */
@Entity
@Table(name = "tbl_mobil_1071")
public class mobil implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMobil;
    @Column(length = 100, nullable = false, unique = true)
    private String merek;
     @Column(length = 100, nullable = false, unique = true)
    private String description;
        @Column(length = 255, nullable = true)
    private String name;
        @OneToMany
    @JoinColumn(name="idMobil")
    private Set<aksesoris> Aksesoris;

    public Long getId() {
        return idMobil;
    }

    public void setId(Long id) {
        this.idMobil = id;
    }

    /**
     * @return the name
     */
    public String getmerek() {
        return merek;
    }

    /**
     * @param name the name to set
     */
    public void setmerek(String merek) {
        this.merek = merek;
    }
    
        
         public String getname() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the name
     */
    
}


