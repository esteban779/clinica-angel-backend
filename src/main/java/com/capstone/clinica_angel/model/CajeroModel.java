
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class CajeroModel {
    
    private Long id_caje;
    private Long id_trab;
    private String estado;

    public CajeroModel() { }

    public CajeroModel(Long id_caje, Long id_trab, String estado) {
        this.id_caje = id_caje;
        this.id_trab = id_trab;
        this.estado = estado;
    }
}
