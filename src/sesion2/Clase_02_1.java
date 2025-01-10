/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import javax.swing.JOptionPane;

/**
 *
 * @author RAFAEL CORREDOR G
 */
public class Clase_02_1 {

/**
 *
 * @author RAFAEL CORREDOR G
 */
    public static void main(String[] args) {
        
    
    // Método principal (psvm)

        /**
         *
         * @author RAFAEL CORREDOR G
         */
        
        // Leer un número entero usando JOptionPane
        String inputEntero = JOptionPane.showInputDialog("Digite un número entero:");
        int numeroEntero = Integer.parseInt(inputEntero);  // Convertir el String a int
        JOptionPane.showMessageDialog(null, "El número entero es: " + numeroEntero);

        // Leer un número decimal (float) usando JOptionPane
        String inputDecimal = JOptionPane.showInputDialog("Digite un número decimal (float):");
        float numeroDecimal = Float.parseFloat(inputDecimal);  // Convertir el String a float
        JOptionPane.showMessageDialog(null, "El número decimal es: " + numeroDecimal);

        // Leer una cadena de texto (nombre) usando JOptionPane
        String nombre = JOptionPane.showInputDialog("Digite su nombre:");
        JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre);

        // Leer un número de tipo double usando JOptionPane
        String inputDouble = JOptionPane.showInputDialog("Digite un número de tipo double:");
        double numeroDouble = Double.parseDouble(inputDouble);  // Convertir el String a double
        JOptionPane.showMessageDialog(null, "El número double es: " + numeroDouble);

        // Constante de tipo float
        final float numeroPi = 3.1416f;
        JOptionPane.showMessageDialog(null, "Valor de Pi: " + numeroPi);
    }


}