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


    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float AlquilarVehiculo(){
        return (float) 29.90;
    }

}
