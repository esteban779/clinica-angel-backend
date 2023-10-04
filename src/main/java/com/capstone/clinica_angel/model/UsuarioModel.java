
package com.capstone.clinica_angel.model;

import java.util.List;
import lombok.Data;

@Data
public class UsuarioModel {
    
    private long id_usua;
    private String username;
    private String pass_hash;
    private String fecha_crea;
    private String ult_login;
    private String estado;
    private List<RolModel> roles;
    
    public UsuarioModel() { }

    public UsuarioModel(long id_usua, String username, String pass_hash, String fecha_crea, String ult_login, String estado, List<RolModel> roles) {
        this.id_usua = id_usua;
        this.username = username;
        this.pass_hash = pass_hash;
        this.fecha_crea = fecha_crea;
        this.ult_login = ult_login;
        this.estado = estado;
        this.roles = roles;
    }
}
