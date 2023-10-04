
package com.capstone.clinica_angel.model;

import lombok.Data;

@Data
public class RolModel {
    
    private long id_rol;
    private String nomb_rol;
    private String estado;

    public RolModel() {
    }

    public RolModel(long id_rol, String nomb_rol, String estado) {
        this.id_rol = id_rol;
        this.nomb_rol = nomb_rol;
        this.estado = estado;
    }

    public RolModel(String nomb_rol) {
        this.nomb_rol = nomb_rol;
    }
}
