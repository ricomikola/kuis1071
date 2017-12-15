/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuiss_1071.repo;

import com.tib.kuiss_1071.entity.aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC35
 */
public interface aksesorisRepo extends CrudRepository<aksesoris, Long> {
        @Query("select a from aksesoris a")
    public List<aksesoris> findAllaksesoris();
   
}
