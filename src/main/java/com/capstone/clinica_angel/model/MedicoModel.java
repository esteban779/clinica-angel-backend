
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class MedicoModel {
    
    private Long id_med;
    private Long id_trab;
    private Long id_usua;
    private Long id_espec;
    private String estado;

    public MedicoModel() { }

    public MedicoModel(Long id_med, Long id_trab, Long id_usua, Long id_espec, String estado) {
        this.id_med = id_med;
        this.id_trab = id_trab;
        this.id_usua = id_usua;
        this.id_espec = id_espec;
        this.estado = estado;
    }
}
