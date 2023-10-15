
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class TrabajadorModel {
    
    private Long id_trab;
    private Long id_usua;
    private String nomb_trab;
    private String apel_trab;
    private String nro_docu;
    private Number edad;
    private String fecha_nac;
    private String fecha_ingr;
    private String fecha_cese;
    private String estado;

    public TrabajadorModel() { }

    public TrabajadorModel(Long id_trab, Long id_usua, String nomb_trab, String apel_trab, String nro_docu, Number edad, String fecha_nac, String fecha_ingr, String fecha_cese, String estado) {
        this.id_trab = id_trab;
        this.id_usua = id_usua;
        this.nomb_trab = nomb_trab;
        this.apel_trab = apel_trab;
        this.nro_docu = nro_docu;
        this.edad = edad;
        this.fecha_nac = fecha_nac;
        this.fecha_ingr = fecha_ingr;
        this.fecha_cese = fecha_cese;
        this.estado = estado;
    }
}
