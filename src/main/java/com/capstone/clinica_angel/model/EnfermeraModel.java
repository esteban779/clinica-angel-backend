
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class EnfermeraModel {
    
    private Long id_enfe;
    private Long id_trab;
    private String estado;
    
    public EnfermeraModel() { }

    public EnfermeraModel(Long id_enfe, Long id_trab, String estado) {
        this.id_enfe = id_enfe;
        this.id_trab = id_trab;
        this.estado = estado;
    }
}
