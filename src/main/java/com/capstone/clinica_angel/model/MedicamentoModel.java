
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class MedicamentoModel {
    
    private Long id_medicamento;
    private String nomb_med;
    private String dosis;
    private String frec;
    private Long id_hist;
    private String estado;

    public MedicamentoModel() { }

    public MedicamentoModel(Long id_medicamento, String nomb_med, String dosis, String frec, Long id_hist, String estado) {
        this.id_medicamento = id_medicamento;
        this.nomb_med = nomb_med;
        this.dosis = dosis;
        this.frec = frec;
        this.id_hist = id_hist;
        this.estado = estado;
    }
}
