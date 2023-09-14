
package com.capstone.clinica_angel.controller;

import com.capstone.clinica_angel.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esteban
 */
@RestController
@RequestMapping("cita")
public class CitaController {
    
    @Autowired
    private CitaService se;
    
}
