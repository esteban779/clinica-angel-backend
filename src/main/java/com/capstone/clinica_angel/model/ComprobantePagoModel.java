
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class ComprobantePagoModel {
    
    private Long id_comp;
    private Long id_caje;
    private Long id_pact;
    private String concepto;
    private String fecha;

    public ComprobantePagoModel() { }

    public ComprobantePagoModel(Long id_comp, Long id_caje, Long id_pact, String concepto, String fecha) {
        this.id_comp = id_comp;
        this.id_caje = id_caje;
        this.id_pact = id_pact;
        this.concepto = concepto;
        this.fecha = fecha;
    }
}
