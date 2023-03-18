package org.example;

public class VelocidadMediaIngles extends VelocidadMediaGeneral implements Traduccion {

    public VelocidadMediaIngles(double distancia, double tiempo) {
        super(distancia, tiempo);
    }

    public VelocidadMediaIngles(){
        super();
    }

    @Override
    public void introducirDistancia() {
        System.out.println("Enter the distance in meters: ");
        introducirDistanciaGeneral();
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Enter the time in seconds: ");
        introducirTiempoGeneral();
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("The average speed is: ");
        System.out.printf("%.2f", calcularVelocidadMedia(distancia, tiempo));
    }

    @Override
    public void finRespuesta() {
        System.out.println(" meters  per hour");
    }
}

