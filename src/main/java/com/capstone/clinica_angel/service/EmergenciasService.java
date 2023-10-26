
package com.capstone.clinica_angel.service;

import com.capstone.clinica_angel.model.Emergencias;
import com.capstone.clinica_angel.repository.IEmergencias;
import com.capstone.clinica_angel.repository.impl.IEmergenciasService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmergenciasService implements IEmergenciasService{
    @Autowired
    private IEmergencias data;
    
    @Override
    public List<Emergencias> listar() {
        return (List<Emergencias>)data.findAll();
    }

    @Override
    public Optional<Emergencias> listarId(int id) {
        return null;
    }

    @Override
    public int save(Emergencias E) {
        return 0;
    }

    @Override
    public void delete(int id) {
      
    }


    
}
