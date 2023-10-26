
package com.capstone.clinica_angel.service.impl;

import com.capstone.clinica_angel.model.TrabajadorModel;
import com.capstone.clinica_angel.repository.AdminRepository;
import com.capstone.clinica_angel.response.ResponseData;
import com.capstone.clinica_angel.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    
    private final AdminRepository repo;
    
    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.repo = adminRepository;
    }
    
    @Override
    public ResponseData registrar_trabajador(TrabajadorModel trabajador) {
        ResponseData response = new ResponseData();
        
        try {
            repo.registrar_trabajador(trabajador);
            response.setIcon("success");
            response.setMensaje("Trabajador " + trabajador.getApel_trab() + ", " + trabajador.getNomb_trab() + " registrado correctamente.");
            response.setSuccess(1);
        } catch (Exception e) {
            response.setMensaje("Se detectó un error al registrar al trabajador " + e.toString());
        }
        
        return response;
    }
}
