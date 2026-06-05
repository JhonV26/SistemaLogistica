package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;
    private static final double COSTO_POR_CONTENEDOR = 50.0;  // USD por contenedor
    
    // Constructor
    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }
    
    // Getter y Setter
    public int getCantidadContenedores() {
        return cantidadContenedores;
    }
    
    public void setCantidadContenedores(int cantidadContenedores) {
        if (cantidadContenedores >= 0) {
            this.cantidadContenedores = cantidadContenedores;
        } else {
            System.out.println("Error: La cantidad de contenedores no puede ser negativa.");
        }
    }
    
    // Método propio
    public void atracarEnPuerto() {
        System.out.println("Buque " + getIdTransporte() + " ha atracado en el puerto y está listo para descarga.");
    }
    
    // Método mostrarDatos con cálculo de costo de viaje
    public void mostrarDatos() {
        double costoViaje = cantidadContenedores * COSTO_POR_CONTENEDOR;
        System.out.println("=== DATOS DEL BUQUE ===");
        System.out.println("ID Transporte: " + getIdTransporte());
        System.out.println("Combustible: " + getCombustible());
        System.out.println("Capacidad de Carga: " + getCapacidadCarga());
        System.out.println("Cantidad de Contenedores: " + cantidadContenedores);
        System.out.println("Costo de Viaje: $" + costoViaje + " USD");
        System.out.println("=======================");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Contenedores=" + cantidadContenedores;
    }
}