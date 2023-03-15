package org.example;

import java.time.LocalDate;

public class Segway extends Vehiculos{

    int autonomia;

    public Segway(String marca, String modelo, LocalDate fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }
}
