
package com.capstone.clinica_angel.repository.impl;

import com.capstone.clinica_angel.model.TrabajadorModel;
import com.capstone.clinica_angel.repository.AdminRepository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AdminRepositoryImpl implements AdminRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void registrar_trabajador(TrabajadorModel trabajador) {
        StoredProcedureQuery procedure = entityManager.createStoredProcedureQuery("sp_agregar_trabajador");
                
        procedure.registerStoredProcedureParameter("v_nombre", String.class, ParameterMode.IN);
        procedure.registerStoredProcedureParameter("v_apellido", String.class, ParameterMode.IN);
        procedure.registerStoredProcedureParameter("c_docu", String.class, ParameterMode.IN);
        procedure.registerStoredProcedureParameter("v_nac", String.class, ParameterMode.IN);
        procedure.registerStoredProcedureParameter("v_ingr", String.class, ParameterMode.IN);
        procedure.registerStoredProcedureParameter("i_tipo", int.class, ParameterMode.IN);
        
        procedure.setParameter("v_nombre", trabajador.getNomb_trab());
        procedure.setParameter("v_apellido", trabajador.getApel_trab());
        procedure.setParameter("c_docu", trabajador.getNro_docu());
        procedure.setParameter("v_nac", trabajador.getFecha_nac());
        procedure.setParameter("v_ingr", trabajador.getFecha_ingr());
        procedure.setParameter("i_tipo", 0);
        
        procedure.execute();
    }
}
