package com.mycompany.autolavado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Hugo Garcia Mendez
 */
public class servicios extends abstrac {

    String s = "";
    double precio = 0;
    double precioBase = 100;

    public void estandar() {
        s = "Estandar";
        precio = 1;
    }

    public void premium() {
        s = "Premium";
        precio = 1.2;
    }

    public void platinum() {
        s = "Platinum";
        precio = 1.5;
    }

    @Override
    public void proceso() {
        System.out.println("se esta haciendo el proceso de lavado: " + s);
        double precioTotal = precio * precioBase;
        System.out.println("su total a pagar es de: "+ precioTotal);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        System.out.println("");
        System.out.println("Gracias por visitar Autolavado \"El carrito feliz\"");
        System.out.println("");
        System.out.println("¡Que tenga un buen dia!");
    }
}
