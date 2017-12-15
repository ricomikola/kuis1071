/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuiss_1071.service;

import com.tib.kuiss_1071.entity.aksesoris;
import com.tib.kuiss_1071.repo.aksesorisRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC35
 */
@Service("aksesorisService")
@Transactional
public class aksesorisService {
    
    @Autowired
    private aksesorisRepo repo;

    public aksesoris insert(aksesoris aksesoris) {
        return repo.save(aksesoris);
    }
    
    public aksesoris update(aksesoris aksesoris) {
        return repo.save(aksesoris);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public aksesoris getById(Long id){
        return repo.findOne(id);
    }
   
    
    public List<aksesoris> getAll(){
        return repo.findAllaksesoris();
    }
}
