package com.mycompany.autolavado;

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
        proceso();
    }

    public void premium() {
        s = "Premium";
        precio = 1.2;
        proceso();
    }

    public void platinum() {
        s = "Platinum";
        precio = 1.5;
        proceso();
    }
    
    public void tiempo(int tiempo) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
    }

    @Override
    public void proceso() {
        System.out.println("se esta haciendo el proceso de lavado: " + s);
        double precioTotal = precio * precioBase;
        System.out.println("Espere por favor...");
        tiempo(7000);
        System.out.println("su total a pagar es de: "+ precioTotal);
        tiempo(3500);
        System.out.println("");
        System.out.println("Gracias por visitar Autolavado \"El carrito feliz\"");
        System.out.println("");
        System.out.println("¡Que tenga un buen dia!");
    }
}
