/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuiss_1071.repo;

import com.tib.kuiss_1071.entity.mobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC35
 */
public interface mobilRepo extends CrudRepository<mobil, Long> {
        @Query("select m from mobil m")
    public List<mobil> findAllmobil();
}
