package org.example;

public class VelocidadMediaFrances extends VelocidadMediaGeneral implements Traduccion {

    public VelocidadMediaFrances(double distancia, double tiempo) {
        super(distancia, tiempo);
    }

    public VelocidadMediaFrances(){
        super();
    }

    @Override
    public void introducirDistancia() {
        System.out.println("Introduzca la distance en km");
        introducirDistanciaGeneral();
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduzca le temps en heures");
        introducirTiempoGeneral();
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("La vitesse moyenne est de");
        System.out.printf("%.2f", calcularVelocidadMedia(distancia, tiempo));
    }

    @Override
    public void finRespuesta() {
        System.out.println("km/h");
    }
}

