package com.mycompany.autolavado;

import java.util.Scanner;

/**
 *
 * @author Victor Hugo Garcia Mendez
 */
public class interfaz {
    servicios s;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("*-*-*Bienvenido al autolavado \"El carro feliz\"*-*-*");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("1.Lavado");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.print("Por favor escoge alguna de las opciones siguientes:");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("");
                
                break;
            default:
                throw new AssertionError();
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
