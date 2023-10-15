
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class HistoriaClinicaModel {
    
    private Long id_hist;
    private Long id_pact;
    private String fecha_adm;
    private String fecha_alta;
    private String diagnosis;
    private Long id_med;
    private Long id_enfe;
    private String estado;

    public HistoriaClinicaModel() { }

    public HistoriaClinicaModel(Long id_hist, Long id_pact, String fecha_adm, String fecha_alta, String diagnosis, Long id_med, Long id_enfe, String estado) {
        this.id_hist = id_hist;
        this.id_pact = id_pact;
        this.fecha_adm = fecha_adm;
        this.fecha_alta = fecha_alta;
        this.diagnosis = diagnosis;
        this.id_med = id_med;
        this.id_enfe = id_enfe;
        this.estado = estado;
    }
}
