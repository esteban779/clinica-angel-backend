
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class EnfermeraModel {
    
    private Long id_enfe;
    private Long id_trab;
    private Long id_usua;
    private String estado;
    
    public EnfermeraModel() { }

    public EnfermeraModel(Long id_enfe, Long id_trab, Long id_usua, String estado) {
        this.id_enfe = id_enfe;
        this.id_trab = id_trab;
        this.id_usua = id_usua;
        this.estado = estado;
    }
}
