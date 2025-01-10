/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.Scanner;

/**
 *
 * @author RAFAEL CORREDOR G
 */
public class Clase_02 {

// psvm 
    public static void main(String[] args) {

        /**
         *
         * @author RAFAEL CORREDOR G
         */
        // Crear un objeto Scanner para la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Ejemplo con diferentes tipos de datos
        // Leer un número entero
        System.out.println("Digite un número entero:");
        int numeroEntero = entrada.nextInt();
        System.out.println("El número entero es: " + numeroEntero);

        // Leer un número de tipo float
        System.out.println("Digite un número decimal (float):");
        float numeroDecimal = entrada.nextFloat();
        System.out.println("El número decimal es: " + numeroDecimal);

        // Leer una cadena de texto
        System.out.println("Digite su nombre:");
        entrada.nextLine();  // Limpiar el buffer del scanner
        String nombre = entrada.nextLine();
        System.out.println("Su nombre es: " + nombre);

        // Leer un número de tipo double
        System.out.println("Digite un número de tipo double:");
        double numeroDouble = entrada.nextDouble();
        System.out.println("El número double es: " + numeroDouble);

        // Constante de tipo float
        final float numeroPi = 3.1416f;
        System.out.println("Valor de Pi: " + numeroPi);

        // Cerrar el scanner
    }

}
