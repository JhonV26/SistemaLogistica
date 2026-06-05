package com.example;

public class CaminoDeReparto extends Transporte {
    private boolean tieneRefrigeracion;
    
    // Constructor
    public CaminoDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }
    
    // Getter y Setter
    public boolean isTieneRefrigeracion() {
        return tieneRefrigeracion;
    }
    
    public void setTieneRefrigeracion(boolean tieneRefrigeracion) {
        this.tieneRefrigeracion = tieneRefrigeracion;
    }
    
    // Sobrescritura del método viajar
    @Override
    public void viajar(int distancia) {
        double consumoPor10km;
        
        if (tieneRefrigeracion) {
            consumoPor10km = 2.0;  // Doble consumo
            System.out.println("(Modo refrigeración activa - Consumo doble)");
        } else {
            consumoPor10km = 1.0;  // Consumo normal
        }
        
        double combustibleNecesario = (distancia / 10.0) * consumoPor10km;
        
        if (combustibleNecesario <= getCombustible()) {
            setCombustible(getCombustible() - combustibleNecesario);
            System.out.println(getIdTransporte() + " viajó " + distancia + "km. Combustible restante: " + getCombustible());
        } else {
            System.out.println(getIdTransporte() + " no tiene suficiente combustible para viajar " + distancia + "km.");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Refrigeración=" + tieneRefrigeracion;
    }
}