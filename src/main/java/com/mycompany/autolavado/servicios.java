package com.mycompany.autolavado;

/**
 *
 * @author Victor Hugo Garcia Mendez
 */
public class servicios extends abstrac {

    String s = "";
    double precio = 0;

    public static void estandar() {
        s = "Estandar";
        precio = 1;
    }

    public static void premium() {
        String s = "Premium";
        double precio = 1.2;
    }

    public static void platinum() {
        String s = "Platinum";
        double precio = 1.5;
    }

    @Override
    public void proceso() {
        System.out.println("");
    }
}
