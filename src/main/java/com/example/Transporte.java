package com.example;

public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;
    
    // Constructor
    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible);  // Usamos el setter con lógica
        setCapacidadCarga(capacidadCarga);  // Usamos el setter con lógica
    }
    
    // Getters
    public String getIdTransporte() {
        return idTransporte;
    }
    
    public double getCombustible() {
        return combustible;
    }
    
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    
    // Setters con lógica
    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else if (nivel > 100) {
            this.combustible = 100;
        } else {
            this.combustible = nivel;
        }
    }
    
    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error: La capacidad de carga no puede ser negativa.");
        } else {
            this.capacidadCarga = carga;
        }
    }
    
    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }
    
    // Método viajar
    public void viajar(int distancia) {
        double combustibleNecesario = distancia / 10.0;
        if (combustibleNecesario <= this.combustible) {
            this.combustible -= combustibleNecesario;
            System.out.println(idTransporte + " viajó " + distancia + "km. Combustible restante: " + this.combustible);
        } else {
            System.out.println(idTransporte + " no tiene suficiente combustible para viajar " + distancia + "km.");
        }
    }
    
    @Override
    public String toString() {
        return "Transporte{id=" + idTransporte + ", combustible=" + combustible + ", capacidadCarga=" + capacidadCarga + "}";
    }
}