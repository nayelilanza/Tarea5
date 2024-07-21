
package com.mycompany.formas;

public class Cuadrado extends Formas{
    public static void main(String[] args) {
        // Declaracion de variables
        double lado = 7.0; // Longitud del lado del cuadrado

        // Calculo del area
        double areaCuadrado = lado * lado;

        // Mostrar el resultado
        System.out.println("Area del cuadrado: " + areaCuadrado);
    }

    Cuadrado(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    @Override
    public void dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}   

