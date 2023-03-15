package org.example;

import java.time.LocalDate;

public class giroscopios extends Vehiculos{

    int autonomia;

    float altura;

    public giroscopios(String marca, String modelo, LocalDate fechaCompra, int autonomia, float altura) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.altura = altura;
    }
}
