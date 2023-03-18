package org.example;

import java.util.Scanner;

public class VelocidadMediaGeneral {
    double distancia;
    double tiempo;

    public VelocidadMediaGeneral(double distancia, double tiempo) {
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public VelocidadMediaGeneral() {
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double calcularVelocidadMedia(double distancia, double tiempo) {
        if (distancia == 0 || tiempo == 0)
            return 0;
        else if (distancia < 0 || tiempo < 0)
            return -1;
        else if (distancia > 0 && tiempo > 0)
            return distancia / tiempo;
        else
            return -1;

    }

    public void introducirDistanciaGeneral() {
        Scanner sc = new Scanner(System.in);
        double distancia = sc.nextDouble();
        setDistancia(distancia);
    }

    public void introducirTiempoGeneral() {
        Scanner sc = new Scanner(System.in);
        double tiempo = sc.nextDouble();
        setTiempo(tiempo);
    }



}
