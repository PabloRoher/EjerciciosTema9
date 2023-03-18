package org.example;

import java.util.Scanner;

public class Menu {

    public void monstrarMenu(){
        System.out.println("¿What language do you want to use?");
        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. German");
        System.out.println("4. French");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                VelocidadMediaIngles velocidadMediaIngles = new VelocidadMediaIngles();
                System.out.println("You have selected English");
                velocidadMediaIngles.introducirDistancia();
                velocidadMediaIngles.introducirTiempo();
                velocidadMediaIngles.inicioRespuesta();
                velocidadMediaIngles.finRespuesta();
                break;
            case 2:
                VelocidadMediaEspanol velocidadMediaEspanol = new VelocidadMediaEspanol();
                System.out.println("Has seleccionado Español");
                velocidadMediaEspanol.introducirDistancia();
                velocidadMediaEspanol.introducirTiempo();
                velocidadMediaEspanol.inicioRespuesta();
                velocidadMediaEspanol.finRespuesta();

                break;
            case 3:
                VelocidadMediaAleman velocidadMediaAleman = new VelocidadMediaAleman();
                System.out.println("Sie haben Deutsch ausgewählt");
                velocidadMediaAleman.introducirDistancia();
                velocidadMediaAleman.introducirTiempo();
                velocidadMediaAleman.inicioRespuesta();
                velocidadMediaAleman.finRespuesta();
                break;
            case 4:
                VelocidadMediaFrances velocidadMediaFrances = new VelocidadMediaFrances();
                System.out.println("Vous avez sélectionné le français");
                velocidadMediaFrances.introducirDistancia();
                velocidadMediaFrances.introducirTiempo();
                velocidadMediaFrances.inicioRespuesta();
                velocidadMediaFrances.finRespuesta();
                break;
            case 5:
                System.out.println("You selected to exit");
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }
}
