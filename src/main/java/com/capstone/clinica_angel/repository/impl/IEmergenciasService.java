
package com.capstone.clinica_angel.repository.impl;

import com.capstone.clinica_angel.model.Emergencias;
import java.util.List;
import java.util.Optional;

public interface IEmergenciasService {
    public List<Emergencias>listar();
    public Optional<Emergencias>listarId(int id);
    public int save(Emergencias E);
    public void delete(int id);
}
