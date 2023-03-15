package org.example;

import java.time.LocalDate;

public class Bicicletas extends Vehiculos{

    int numeroMarchas;


    public Bicicletas(String marca, String modelo, LocalDate fechaCompra, int numeroMarchas) {
        super(marca, modelo, fechaCompra);
        this.numeroMarchas = numeroMarchas;
    }



    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public float AlquilarVehiculo(){
        return (float) 4.90;
    }


}
