
package com.capstone.clinica_angel.controller;

import com.capstone.clinica_angel.controller.UsuarioController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
//@RequestMapping("usuario")
public class UsuarioController {
    
//    private UsuarioService se;
    
    @RequestMapping("index")
    public String inicio() {
        return "index";
    }
    
     @RequestMapping("RegistroCitas")
    public String registroCitas() {
        return "RegistroCitas";
    }
    
    @RequestMapping("Contacto")
    public String contacto() {
        return "Contacto";
    }
    
    @RequestMapping("Emergencia")
    public String emergencia() {
        return "Emergencia";
    }
}
