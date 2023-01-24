/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.putri.gaji.service.repository;

import com.putri.gaji.service.entity.Gaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author putri
 */
@Repository
public interface GajiRepository extends JpaRepository<Gaji, Long> {

    public Gaji findByGajiId(Long gajiId);

    
}