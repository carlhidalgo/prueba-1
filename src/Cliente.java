/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Cliente {
    // Atributos del cliente
    private String nombre;
    private String tipo; // N para nuevo, A para antiguo
    private String apellido;
    private String run;
    private String direccion;
    // Constructor
    public Cliente(String nombre, String tipo, String apellido, String direccion, String run) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.apellido = apellido;
        this.direccion = direccion;
        this.run = run;
    }

    // Métodos accesadores y mutadores para los atributos del cliente
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}



