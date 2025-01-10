/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import java.util.Scanner;

/**
 *
 * @author RAFAEL CORREDOR G
 */
public class clase2 {

    public static void main(String[] args) {
        int dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");

                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de semana");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un número del 1 al 12: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Mes inválido");
        }

        //El programa aplica un descuento dependiendo de la categoría del cliente.
        System.out.print("Seleccione su categoría de cliente (1: Regular, 2: Premium, 3: VIP): ");
        int categoria = scanner.nextInt();
        System.out.print("Digite el precio original del producto: ");
        double precio = scanner.nextDouble();

        double precioFinal;

        switch (categoria) {
            case 1:
                precioFinal = precio;  // Sin descuento
                System.out.println("Precio final: " + precioFinal);
                break;
            case 2:
                precioFinal = precio * 0.90;  // 10% de descuento
                System.out.println("Precio final con descuento: " + precioFinal);
                break;
            case 3:
                precioFinal = precio * 0.80;  // 20% de descuento
                System.out.println("Precio final con descuento: " + precioFinal);
                break;
            default:
                System.out.println("Categoría inválida");
        }

// califacion de esudiante
        System.out.print("Digite la calificación del estudiante (0-100): ");
        int calificacion = scanner.nextInt();

        switch (calificacion) {
            case 10:
            case 9:
                System.out.println("Excelente");
                break;
            case 8:
                System.out.println("Muy bien");
                break;
            case 7:
                System.out.println("Bien");
                break;
            case 6:
                System.out.println("Suficiente");
                break;
            default:
                System.out.println("Insuficiente");
        }

// calculo de figuras
        System.out.println("Seleccione la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();

        double area;

        switch (opcion) {
            case 1:
                System.out.print("Digite el radio del círculo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
                break;
            case 2:
                System.out.print("Digite el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 3:
                System.out.print("Digite el largo del rectángulo: ");
                double largo = scanner.nextDouble();
                System.out.print("Digite el ancho del rectángulo: ");
                double ancho = scanner.nextDouble();
                area = largo * ancho;
                System.out.println("El área del rectángulo es: " + area);
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
