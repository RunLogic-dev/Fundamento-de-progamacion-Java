package sesion2;

/**
 *
 * @author RAFAEL CORREDOR G
 */
public class Clase_01 {

    // Método principal (psvm)
    public static void main(String[] args) {

        // Variables en Java
        int numero = 1;                    // Variable de tipo entero
        float dinero = 10.500f;            // Variable de tipo float
        String nombre = "Rafael";          // Variable de tipo String
        String apellido = "Corredor";     // Variable de tipo String
        double estatura = 1.75;           // Variable de tipo double

        // Constantes en Java
        final float numeroPi = 3.1416f;   // Constante de tipo float
        System.out.println("Valor de Pi: " + numeroPi);

        // Diferencia entre constantes y variables:
        // Una constante se declara con la palabra clave 'final' y su valor no puede cambiar
        // Una variable puede cambiar su valor durante la ejecución del programa

        // Ejemplo de uso de variables:
        numero = 10;                       // Se puede modificar el valor de la variable
        System.out.println("Nuevo valor de numero: " + numero);

        // Ejemplo de uso de constante:
        // numeroPi = 3.14f;                // Esto causaría un error de compilación porque 'numeroPi' es constante

    }
}
