
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class CitaModel {
    
    private Long id_cita;
    private Long id_pact;
    private Long id_med;
    private String fecha;
    private String estado;

    public CitaModel() { }

    public CitaModel(Long id_cita, Long id_pact, Long id_med, String fecha, String estado) {
        this.id_cita = id_cita;
        this.id_pact = id_pact;
        this.id_med = id_med;
        this.fecha = fecha;
        this.estado = estado;
    }
}
