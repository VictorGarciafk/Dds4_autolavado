package com.mycompany.autolavado;

import java.util.Scanner;

/**
 *
 * @author Victor Hugo Garcia Mendez
 */
public class interfaz {

    public static void main(String[] args) {
        servicios s = new servicios();
        
        double precio = 0;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*-*Bienvenido al autolavado \"El carro feliz\"*-*-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("");
        System.out.println("Que tipo de lavado desea?");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("1.Estandar");
        System.out.println("2.Premium");
        System.out.println("3.Platinum");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.print("Por favor escoge alguna de las opciones siguientes:");
        opcion = sc.nextInt();
        System.out.println("");

        switch (opcion) {
            case 1:
                s.estandar();
                break;
            case 2:
                s.premium();
                break;
            case 3:
                s.platinum();
                break;
            default:
                System.out.println("Favor de escoger alguna de las opciones que se le ofrece");
        }
    }
    /*
    Citas
     Crear
     Consultar
     Eliminar
    Pagos
    Reclamaciones
    turnos
    trabajo especial
     */
}
