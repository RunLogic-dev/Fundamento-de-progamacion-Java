/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import javax.swing.JOptionPane;

/**
 *
 * @author RAFAEL CORREDOR G
 */
public class clase1 {
    // psvm

    public static void main(String[] args) {

        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));

        if (edad >= 19) {

            System.out.println(" su edad es mayor y puede ingresar a la discoteca");
        } else {
            System.out.println(" su edad es menor y no puede ingresar a la discoteca");

        }

        // verificar si un numero es impar
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

//    Crea un programa que determine un descuento dependiendo de la edad del usuario.
//
//Menores de 12 años: 50% de descuento.
//Entre 12 y 18 años: 25% de descuento.
//Mayores de 18 años: Sin descuento.
        int edad1;

        edad1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));

        if (edad1 < 12) {
            System.out.println("Tienes un 50% de descuento.");
        } else if (edad1 >= 12 && edad1 <= 18) {
            System.out.println("Tienes un 25% de descuento.");
        } else {
            System.out.println("No tienes descuento.");

        }

//    
//    Escribe un programa que solicite una calificación (entre 0 y 100) y clasifique el resultado:
//
//90-100: Excelente
//80-89: Bueno
//70-79: Aprobado
//Menor a 70: Reprobado
        int calificacion;

        calificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite su calificación (0-100)"));

        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Bueno");
        } else if (calificacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");

        }

//    
//    Escribe un programa que solicite dos números y determine cuál es mayor o si son iguales.
//
//java
//Copiar código
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));

        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("El número " + numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite su calificación (0-100)"));

        if (nota >= 90) {
            System.out.println("Tu calificación es A.");
        } else if (nota >= 80) {
            System.out.println("Tu calificación es B.");
        } else if (nota >= 70) {
            System.out.println("Tu calificación es C.");
        } else if (nota >= 60) {
            System.out.println("Tu calificación es D.");
        } else {
            System.out.println("Tu calificación es F.");
        }
    }
}
