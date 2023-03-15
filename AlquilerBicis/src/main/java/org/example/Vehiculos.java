package org.example;


import java.time.LocalDate;


public abstract class Vehiculos {

    String marca;
    String modelo;
    LocalDate fechaCompra;


    public Vehiculos(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }


}
