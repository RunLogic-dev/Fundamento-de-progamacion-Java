/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

/**
 *
 * @author RAFAEL CORREDOR G
 */
public class EjerciciosCiclos {

    public static void main(String[] args) {

        // **Ejercicios con ciclo FOR:**

        // 1. Imprimir los números del 1 al 5
        System.out.println("1. Números del 1 al 5 con for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. Imprimir los primeros 5 números impares
        System.out.println("\n2. Primeros 5 números impares con for:");
        for (int i = 1; i <= 9; i += 2) {  // i += 2 da los impares
            System.out.println(i);
        }

        // 3. Sumar los números del 1 al 3
        System.out.println("\n3. Sumar los números del 1 al 3 con for:");
        int suma = 0;
        for (int i = 1; i <= 3; i++) {
            suma += i;  // Va sumando los números
        }
        System.out.println("La suma es: " + suma);

        // 4. Imprimir la tabla de multiplicar del 2
        System.out.println("\n4. Tabla de multiplicar del 2 con for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }

        // 5. Contar cuántos números divisibles por 2 hay entre 1 y 6
        System.out.println("\n5. Números divisibles por 2 entre 1 y 6 con for:");
        int contador = 0;
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {  // Si el número es divisible por 2
                contador++;
            }
        }
        System.out.println("Cantidad de números divisibles por 2: " + contador);

        // 6. Imprimir los números del 1 al 10, pero solo los divisibles por 3
        System.out.println("\n6. Números del 1 al 10 divisibles por 3 con for:");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // 7. Sumar los números del 1 al 10 usando un for
        System.out.println("\n7. Sumar los números del 1 al 10 con for:");
        int sumaTotal = 0;
        for (int i = 1; i <= 10; i++) {
            sumaTotal += i;
        }
        System.out.println("La suma total es: " + sumaTotal);

        // 8. Contar cuántos números impares hay entre 1 y 10
        System.out.println("\n8. Contar los números impares entre 1 y 10 con for:");
        int impares = 0;
        for (int i = 1; i <= 10; i += 2) {  // i += 2 da los impares
            impares++;
        }
        System.out.println("Cantidad de números impares: " + impares);

        // 9. Imprimir los números del 10 al 1 (decreciendo)
        System.out.println("\n9. Números del 10 al 1 con for:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 10. Imprimir la tabla de multiplicar del 3
        System.out.println("\n10. Tabla de multiplicar del 3 con for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));
        }


        // **Ejercicios con ciclo WHILE:**

        // 1. Imprimir los números del 1 al 5
        System.out.println("\n1. Números del 1 al 5 con while:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++; // Incrementa i
        }

        // 2. Imprimir los primeros 5 números impares
        System.out.println("\n2. Primeros 5 números impares con while:");
        i = 1;
        while (i <= 9) {
            System.out.println(i);
            i += 2; // Incrementa de 2 en 2 para obtener los impares
        }

        // 3. Sumar los números del 1 al 3
        System.out.println("\n3. Sumar los números del 1 al 3 con while:");
        int sumaWhile = 0;
        i = 1;
        while (i <= 3) {
            sumaWhile += i; // Va sumando los números
            i++;
        }
        System.out.println("La suma es: " + sumaWhile);

        // 4. Imprimir la tabla de multiplicar del 2
        System.out.println("\n4. Tabla de multiplicar del 2 con while:");
        i = 1;
        while (i <= 10) {
            System.out.println("2 * " + i + " = " + (2 * i));
            i++;
        }

        // 5. Contar cuántos números divisibles por 2 hay entre 1 y 6
        System.out.println("\n5. Números divisibles por 2 entre 1 y 6 con while:");
        int contadorWhile = 0;
        i = 1;
        while (i <= 6) {
            if (i % 2 == 0) {
                contadorWhile++;
            }
            i++;
        }
        System.out.println("Cantidad de números divisibles por 2: " + contadorWhile);

        // 6. Imprimir los números del 1 al 10, pero solo los divisibles por 3
        System.out.println("\n6. Números del 1 al 10 divisibles por 3 con while:");
        i = 1;
        while (i <= 10) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // 7. Sumar los números del 1 al 10 usando un while
        System.out.println("\n7. Sumar los números del 1 al 10 con while:");
        int sumaTotalWhile = 0;
        i = 1;
        while (i <= 10) {
            sumaTotalWhile += i;
            i++;
        }
        System.out.println("La suma total es: " + sumaTotalWhile);

        // 8. Contar cuántos números impares hay entre 1 y 10
        System.out.println("\n8. Contar los números impares entre 1 y 10 con while:");
        int imparesWhile = 0;
        i = 1;
        while (i <= 10) {
            if (i % 2 != 0) {
                imparesWhile++;
            }
            i++;
        }
        System.out.println("Cantidad de números impares: " + imparesWhile);

        // 9. Imprimir los números del 10 al 1 (decreciendo)
        System.out.println("\n9. Números del 10 al 1 con while:");
        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        // 10. Imprimir la tabla de multiplicar del 3
        System.out.println("\n10. Tabla de multiplicar del 3 con while:");
        i = 1;
        while (i <= 10) {
            System.out.println("3 * " + i + " = " + (3 * i));
            i++;
        }


        // **Ejercicios con ciclo DO-WHILE:**

        // 1. Imprimir los números del 1 al 5
        System.out.println("\n1. Números del 1 al 5 con do-while:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        // 2. Imprimir los primeros 5 números impares
        System.out.println("\n2. Primeros 5 números impares con do-while:");
        i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 9);

        // 3. Sumar los números del 1 al 3
        System.out.println("\n3. Sumar los números del 1 al 3 con do-while:");
        int sumaDoWhile = 0;
        i = 1;
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= 3);
        System.out.println("La suma es: " + sumaDoWhile);

        // 4. Imprimir la tabla de multiplicar del 2
        System.out.println("\n4. Tabla de multiplicar del 2 con do-while:");
        i = 1;
        do {
            System.out.println("2 * " + i + " = " + (2 * i));
            i++;
        } while (i <= 10);

        // 5. Contar cuántos números divisibles por 2 hay entre 1 y 6
        System.out.println("\n5. Números divisibles por 2 entre 1 y 6 con do-while:");
        int contadorDoWhile = 0;
        i = 1;
        do {
            if (i % 2 == 0) {
                contadorDoWhile++;
            }
            i++;
        } while (i <= 6);
        System.out.println("Cantidad de números divisibles por 2: " + contadorDoWhile);

        // 6. Imprimir los números del 1 al 10, pero solo los divisibles por 3
        System.out.println("\n6. Números del 1 al 10 divisibles por 3 con do-while:");
        i = 1;
        do {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 10);

        // 7. Sumar los números del 1 al 10 usando un do-while
        System.out.println("\n7. Sumar los números del 1 al 10 con do-while:");
        int sumaTotalDoWhile = 0;
        i = 1;
        do {
            sumaTotalDoWhile += i;
            i++;
        } while (i <= 10);
        System.out.println("La suma total es: " + sumaTotalDoWhile);

        // 8. Contar cuántos números impares hay entre 1 y 10
        System.out.println("\n8. Contar los números impares entre 1 y 10 con do-while:");
        int imparesDoWhile = 0;
        i = 1;
        do {
            if (i % 2 != 0) {
                imparesDoWhile++;
            }
            i++;
        } while (i <= 10);
        System.out.println("Cantidad de números impares: " + imparesDoWhile);

        // 9. Imprimir los números del 10 al 1 (decreciendo)
        System.out.println("\n9. Números del 10 al 1 con do-while:");
        i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

        // 10. Imprimir la tabla de multiplicar del 3
        System.out.println("\n10. Tabla de multiplicar del 3 con do-while:");
        i = 1;
        do {
            System.out.println("3 * " + i + " = " + (3 * i));
            i++;
        } while (i <= 10);
    }
}
