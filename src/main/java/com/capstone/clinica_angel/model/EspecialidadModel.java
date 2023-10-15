
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class EspecialidadModel {
    
    private Long id_espec;
    private String nomb_espec;
    private String estado;

    public EspecialidadModel() { }

    public EspecialidadModel(Long id_espec, String nomb_espec, String estado) {
        this.id_espec = id_espec;
        this.nomb_espec = nomb_espec;
        this.estado = estado;
    }
}
