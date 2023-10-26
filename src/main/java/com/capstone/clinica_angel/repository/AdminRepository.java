
package com.capstone.clinica_angel.repository;

import com.capstone.clinica_angel.model.TrabajadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<TrabajadorModel, Long> {
    
    @Procedure("sp_agregar_trabajador")
    public void registrar_trabajador(TrabajadorModel trabajador
            /*@Param("v_nombre") String nombre,
            @Param("v_apellido") String apellido,
            @Param("c_docu") String documento,
            @Param("v_nac") String fecha_nac,
            @Param("v_ingr") String fecha_ingr,
            @Param("i_tipo") int tipo*/
    );
}
