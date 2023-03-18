package org.example;

import java.time.LocalDate;
import java.util.HashMap;

public class Menu {

    public void menuPrincipal() {

        HashMap<String, Object> vehiculos = new HashMap<String, Object>();

        Bicicletas bici = new Bicicletas("Lapierre", "speed 400", null, 27);
        Bicicletas bici2 = new Bicicletas("Btwin", "riverside 900", null, 10);
        giroscopios giroscopio = new giroscopios("Segway", "Nine", null, 40, 1.2f);
        giroscopios giroscopio2 = new giroscopios("Weebot", "Echo", null, 35, 1.6f);
        Segway segway = new Segway("Immotion", "V8", null, 40);
        Segway segway2 = new Segway("Segway", "Ninebot One E+", null, 30);

        vehiculos.put(bici.marca, bici);
        vehiculos.put(bici2.marca, bici2);
        vehiculos.put(giroscopio.marca, giroscopio);
        vehiculos.put(giroscopio2.marca, giroscopio2);
        vehiculos.put(segway.marca, segway);
        vehiculos.put(segway2.marca, segway2);

        for (String key : vehiculos.keySet() ) {
            System.out.println(key + " " + vehiculos.get(key));
        }

    }
}
