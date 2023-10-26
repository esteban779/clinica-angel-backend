
package com.capstone.clinica_angel.response;

public class ResponseData {
    
    private int success;
    private String mensaje;
    private String icon;

    public int getSuccess() {
        if (success == 0) {
            success = 2;
        }
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getIcon() {
        if (icon == null) {
            icon = "error";
        }
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
