
package com.capstone.clinica_angel.model;


import lombok.Data;

@Data


public class PacienteModel {

    private Long id_pact;
    private String nombre;
    private String apellido;
    private Number edad;
    private String fecha_nac;
    private String direccion;
    private String telefono;
    private String estado;

    public PacienteModel() {
    }

    public PacienteModel(Long id_pact, String nombre, String apellido, Number edad, String fecha_nac, String direccion, String telefono, String estado) {
        this.id_pact = id_pact;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }
}
