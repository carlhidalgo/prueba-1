/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un cliente nuevo
        Cliente cliente1 = new Cliente("juan", "N", "perez", "av,valparaiso", "20271448");

        // Crear un plan para el cliente
        Plan plan1 = new Plan(12345678, "Plan Básico", 7990.0);

        // Mostrar información del plan antes de aplicar el descuento
        System.out.println("Información del Plan antes del descuento:");
        plan1.mostrarInformacion();

        // Aplicar un descuento al plan
        plan1.aplicarDescuento(cliente1, 10); // Aplicar un 10%
    }
}