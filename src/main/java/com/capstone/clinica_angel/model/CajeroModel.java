
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class CajeroModel {
    
    private Long id_caje;
    private Long id_trab;
    private Long id_usua;
    private String estado;

    public CajeroModel() { }

    public CajeroModel(Long id_caje, Long id_trab, Long id_usua, String estado) {
        this.id_caje = id_caje;
        this.id_trab = id_trab;
        this.id_usua = id_usua;
        this.estado = estado;
    }
}
