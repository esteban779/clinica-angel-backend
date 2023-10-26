
package com.capstone.clinica_angel.controller;

import com.capstone.clinica_angel.model.Emergencias;
import com.capstone.clinica_angel.repository.impl.IEmergenciasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class EmergenciasController {
    @Autowired
    public IEmergenciasService service;
    
    @GetMapping("/Emergencias")
    public String listar(Model model){
        List<Emergencias>emergencias=service.listar();
        model.addAttribute("Emergencias", emergencias);
        return "index";
    }
}
