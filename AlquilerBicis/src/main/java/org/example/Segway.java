package org.example;

import java.time.LocalDate;

public class Segway extends Vehiculos{

    int autonomia;

    public Segway(String marca, String modelo, LocalDate fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }


    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public float AlquilarVehiculo(){
        return (float) 18.90;
    }

}
