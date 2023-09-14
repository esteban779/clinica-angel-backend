/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.capstone.clinica_angel.service.impl;

import com.capstone.clinica_angel.repository.CitaRepository;
import com.capstone.clinica_angel.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esteban
 */
@Service
public class CitaServiceImpl implements CitaService {
    
    @Autowired
    private CitaRepository repo;
}
