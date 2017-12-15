/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuiss_1071.controller;

/**
 *
 * @author PC35
 */
import com.tib.kuiss_1071.entity.aksesoris;
import com.tib.kuiss_1071.service.aksesorisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aksesoris")
public class aksesorisController {
    @Autowired
    private aksesorisService aksesorisService;

    @RequestMapping(method = RequestMethod.POST)
    public aksesoris insert(@RequestBody aksesoris aksesoris) {
        return aksesorisService.insert(aksesoris);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public aksesoris update(@RequestBody aksesoris aksesoris) {
        return aksesorisService.update(aksesoris);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return aksesorisService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public aksesoris getById(@PathVariable("id") Long id){
        return aksesorisService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<aksesoris> getAll(){
        return aksesorisService.getAll();
    }
}


