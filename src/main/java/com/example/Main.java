package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA LOGITECH 2.0 ===\n");
        
        // 1. Instanciación Segura
        System.out.println("1. CREANDO VEHÍCULOS:");
        CaminoDeReparto camion = new CaminoDeReparto("CAM-001", 80.0, 5000.0, true);
        BuqueCarga buque = new BuqueCarga("BUQ-001", 95.0, 20000.0, 50);
        
        System.out.println("Camión creado: " + camion);
        System.out.println("Buque creado: " + buque);
        
        System.out.println("\n2. PRUEBA DE FUEGO - VALIDACIÓN DE SETTERS:");
        System.out.println("Intentando asignar combustible negativo (-20):");
        camion.setCombustible(-20);
        System.out.println("Valor actual de combustible del camión: " + camion.getCombustible() + " (Debería ser 0)");
        
        System.out.println("\nIntentando asignar capacidad de carga negativa:");
        buque.setCapacidadCarga(-1000);
        System.out.println("Valor actual de capacidad de carga del buque: " + buque.getCapacidadCarga());
        
        System.out.println("\n3. DEMOSTRACIÓN DE POLIMORFISMO:");
        // Crear ArrayList de tipo Transporte
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);
        
        System.out.println("\nHaciendo viajar a toda la flota 100km:");
        System.out.println("----------------------------------------");
        
        // Usar un bucle para que ambos viajen
        for (Transporte transporte : flota) {
            System.out.println("\nVehículo: " + transporte.getIdTransporte());
            transporte.viajar(100);
        }
        
        System.out.println("\n----------------------------------------");
        System.out.println("\n4. MÉTODOS ESPECÍFICOS:");
        
        // Mostrar datos específicos del buque
        buque.mostrarDatos();
        
        // Atracar el buque en puerto
        buque.atracarEnPuerto();
        
        System.out.println("\n5. ESTADO FINAL DE LOS VEHÍCULOS:");
        System.out.println("Camión: " + camion);
        System.out.println("Buque: " + buque);
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}