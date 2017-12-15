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
@Table(name = "tbl_aksesoris_1071")
public class aksesoris implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String name;
    private double price;
    @Column(length = 255, nullable = true)
    private String tahun;
    @Column
    private Long idMobil;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
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
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the tahun
     */
    public String gettahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void settahun(String tahun) {
        this.tahun = tahun;
    }

    /**
     * @return the category
     */
    public Long getIdmobil() {
        return idMobil;
    }

    /**
     * @param category the category to set
     */
    public void setMobil(Long mobil) {
        this.idMobil = mobil;
    }
    
    
}
