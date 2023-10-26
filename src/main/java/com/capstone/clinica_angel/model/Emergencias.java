
package com.capstone.clinica_angel.model;
import lombok.Data;

@Data
public class Emergencias {
 
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Altura;
    private String Peso;
    private int Telefono;
    private String Genero;
    private String Alergias;
    private String Doctor;
    private String Email;

    public Emergencias() {
    }

    public Emergencias(int Id, String Nombre, String Apellido, String Altura, String Peso, int Telefono, String Genero, String Alergias, String Doctor, String Email) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Telefono = Telefono;
        this.Genero = Genero;
        this.Alergias = Alergias;
        this.Doctor = Doctor;
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}

