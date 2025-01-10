/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.Scanner;

import java.util.Scanner;

public class Clase_02_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ejercicio 1: Cálculo de suma y promedio de notas
        // ------------------------------------------------
        // Hacer un programa que calcule la suma y el promedio de tres notas ingresadas por el usuario.
        System.out.println("Digite sus 3 notas:");
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();

        float suma = nota1 + nota2 + nota3;
        float promedio = suma / 3;

        System.out.println("La suma de sus notas es: " + suma);
        System.out.println("El promedio de sus notas es: " + promedio);

        // Ejercicio 2: Cálculo del valor de la compra
        // ------------------------------------------------
        // Hacer un programa que calcule el valor de la compra de pan. 
        // Cada pan cuesta 600 pesos y el cliente ingresa la cantidad de panes que desea comprar.
        System.out.println("\n¿Cuántos panes desea comprar (cada uno cuesta 600 pesos)?");
        int cantidadPan = entrada.nextInt();
        int precioPan = 600;
        int totalCompra = cantidadPan * precioPan;

        System.out.println("El valor total de la compra es: " + totalCompra + " pesos.");

        // Ejercicio 3: Dinero total entre Juliana, Pedro y Sofía
        // ------------------------------------------------
        // Juliana tiene $100 dólares.
        // Pedro tiene la mitad de lo que posee Juliana.
        // Sofía tiene la mitad de lo que poseen Juliana y Pedro juntos.
        // Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
        // Pasos a seguir:
        // 1. Determinar cuánto dinero tiene Pedro.
        // 2. Determinar cuánto dinero tiene Sofía.
        // 3. Sumar los montos de Juliana, Pedro y Sofía para obtener el total.
        System.out.println("\nDinero total entre Juliana, Pedro y Sofía:");
        float juliana = 100f; // dólares
        float pedro = juliana / 2;
        float sofia = (juliana + pedro) / 2;
        float totalDinero = juliana + pedro + sofia;

        System.out.println("Juliana tiene: $" + juliana);
        System.out.println("Pedro tiene: $" + pedro);
        System.out.println("Sofía tiene: $" + sofia);
        System.out.println("Total entre los tres: $" + totalDinero);

        // Ejercicio 4: Nota final de un estudiante
        // ------------------------------------------------
        // Calcular la nota final de un estudiante, considerando que la evaluación se compone de cuatro componentes:
        // - Primer corte: 20%
        // - Segundo corte: 20%
        // - Tercer corte: 20%
        // - Examen final: 40%
        System.out.println("\nDigite las notas de los siguientes cortes y el examen final:");
        System.out.print("Primer corte (20%): ");
        float primerCorte = entrada.nextFloat();
        System.out.print("Segundo corte (20%): ");
        float segundoCorte = entrada.nextFloat();
        System.out.print("Tercer corte (20%): ");
        float tercerCorte = entrada.nextFloat();
        System.out.print("Examen final (40%): ");
        float examenFinal = entrada.nextFloat();

        float notaFinal = (primerCorte * 0.2f) + (segundoCorte * 0.2f) + (tercerCorte * 0.2f) + (examenFinal * 0.4f);
        System.out.println("La nota final del estudiante es: " + notaFinal);

        entrada.close();
    }
}
