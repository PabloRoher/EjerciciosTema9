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


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public abstract float AlquilarVehiculo();

    public float AlquilarVehiculo(){
        return 0;
    }




}
