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
public class Clase_02_2 {
    public static void main(String[] args) {
        



        // Crear un objeto Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Leer el primer número
        System.out.print("Digite el primer número: ");
        float n1 = entrada.nextFloat();

        // Leer el segundo número
        System.out.print("Digite el segundo número: ");
        float n2 = entrada.nextFloat();

        // Realizar operaciones
        float suma = n1 + n2;
        float resta = n1 - n2;
        float mult = n1 * n2;
        float div = n1 / n2;
        float resto = n1 % n2;

        // Mostrar los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + mult);
        System.out.println("La división es: " + div);
        System.out.println("El resto es: " + resto);

        // Cerrar el scanner
    
}

        
    }
   
