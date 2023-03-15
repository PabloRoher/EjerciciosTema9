package org.example;

import java.time.LocalDate;

public class Bicicletas extends Vehiculos{

    int numeroMarchas;


    public Bicicletas(String marca, String modelo, LocalDate fechaCompra, int numeroMarchas) {
        super(marca, modelo, fechaCompra);
        this.numeroMarchas = numeroMarchas;
    }

}
