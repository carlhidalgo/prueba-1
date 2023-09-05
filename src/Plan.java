/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Plan {
    // Atributos del plan
    private int numeroPlan;
    private String nombrePlan;
    private double precio;
    private int minutos;

    // Constructor
    public Plan(int numeroPlan, String nombrePlan, double precio) {
        this.numeroPlan = numeroPlan;
        this.nombrePlan = nombrePlan;
        this.precio = precio;
        this.minutos = 0; // Inicialmente, el plan no tiene minutos
    }

    // Métodos accesadores y mutadores para los atributos del plan
    public int getNumeroPlan() {
        return numeroPlan;
    }

    public void setNumeroPlan(int numeroPlan) {
        this.numeroPlan = numeroPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    // Método para mostrar información del plan
    public void mostrarInformacion() {
        System.out.println("Número de Plan: " + numeroPlan);
        System.out.println("Nombre del Plan: " + nombrePlan);
        System.out.println("Precio: $" + precio);
        System.out.println("Minutos disponibles: " + minutos);
    }

    // Método para aplicar un descuento al plan
    public void aplicarDescuento(Cliente cliente, double valorDescuento) {
        if (cliente.getTipo().equalsIgnoreCase("N") || precio >= 20000) {
            precio -= precio * (valorDescuento / 100.0);
        }
    }

    // Método para agregar minutos al plan
    public void agregarMinutos(int minutosAgregar) {
        minutos += minutosAgregar;
    }
    
}