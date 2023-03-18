package org.example;

public class VelocidadMediaEspanol extends VelocidadMediaGeneral implements Traduccion{

    public VelocidadMediaEspanol(double distancia, double tiempo) {
        super(distancia, tiempo);
    }

    public VelocidadMediaEspanol(){
        super();
    }

    public void introducirDistancia(){
        System.out.println("Introduzca la distancia recorrida en metros: ");
        introducirDistanciaGeneral();
    }

    public void introducirTiempo(){
        System.out.println("Introduzca el tiempo en segundos: ");
        introducirTiempoGeneral();
    }

    public void inicioRespuesta(){
        System.out.printf("La velocidad media es: ");
        System.out.printf("%.2f", calcularVelocidadMedia(distancia, tiempo));

    }

    public void finRespuesta(){
        System.out.println(" metros por segundo");
    }

}
