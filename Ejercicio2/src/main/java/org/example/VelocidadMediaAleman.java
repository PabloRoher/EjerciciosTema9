package org.example;

public class VelocidadMediaAleman extends VelocidadMediaGeneral implements Traduccion {
    public VelocidadMediaAleman(double distancia, double tiempo) {
        super(distancia, tiempo);
    }

    public VelocidadMediaAleman() {
    }

    @Override
    public void introducirDistancia() {
    System.out.println("Geben Sie die zurückgelegte Strecke in Metern ein: ");
        calcularVelocidadMedia(distancia, tiempo);
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Geben Sie die Zeit in Sekunden ein: ");
        introducirTiempoGeneral();
    }

    @Override
    public void inicioRespuesta() {
        System.out.printf("Die Durchschnittsgeschwindigkeit ist: ");
        System.out.printf("%.2f", calcularVelocidadMedia(distancia, tiempo));
    }

    @Override
    public void finRespuesta() {
        System.out.println(" Meter pro Sekunde");
    }
}

