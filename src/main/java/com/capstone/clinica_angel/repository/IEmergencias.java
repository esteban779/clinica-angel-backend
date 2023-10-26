
package com.capstone.clinica_angel.repository;

import com.capstone.clinica_angel.model.Emergencias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmergencias extends CrudRepository<Emergencias, Integer>{
        
}
