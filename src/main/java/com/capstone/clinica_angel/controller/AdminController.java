
package com.capstone.clinica_angel.controller;

import com.capstone.clinica_angel.model.TrabajadorModel;
import com.capstone.clinica_angel.response.ResponseData;
import com.capstone.clinica_angel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("admin")
public class AdminController {
    
    private final AdminService se;
    
    @Autowired
    public AdminController(AdminService service) {
        this.se = service;
    }
    
    @RequestMapping(value = "registrar_trabajador", method = RequestMethod.GET)
    public ResponseData registrar_trabajador(@RequestParam TrabajadorModel trabajador) {
        return se.registrar_trabajador(trabajador);
    }
    
}
