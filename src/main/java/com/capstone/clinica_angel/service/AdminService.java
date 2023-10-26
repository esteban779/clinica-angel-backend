
package com.capstone.clinica_angel.service;

import com.capstone.clinica_angel.model.TrabajadorModel;
import com.capstone.clinica_angel.response.ResponseData;

public interface AdminService {
    
    public ResponseData registrar_trabajador(TrabajadorModel trabajador);
}
