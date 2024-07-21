//Josselin Nayeli Lanza Ramos 202110020022

package com.mycompany.formas;


public class Figuras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(8.0);
        Linea linea = new Linea(20.0);
        Triangulo triangulo = new Triangulo(15.0);
        Cuadrado cuadrado = new Cuadrado(7.0);

        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();
        
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}



