/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.putri.golongan.service.service;

import com.putri.golongan.service.entity.Golongan;
import com.putri.golongan.service.repository.GolonganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class GolonganService {
    @Autowired
    private GolonganRepository golonganRepository;
    
    public Golongan saveGolongan (Golongan golongan){
        return golonganRepository.save(golongan);
    } 
    
    public Golongan findGolonganById(Long golonganId){
        return golonganRepository.findByGolonganId(golonganId);
    }
    
}
