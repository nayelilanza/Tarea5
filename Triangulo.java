
package com.mycompany.formas;


public class Triangulo extends Formas{
    private final double base;
    private double altura;

    public Triangulo(double base) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args)  {
        double baseTriangulo = 15.0;
       Triangulo miTriangulo = new Triangulo(baseTriangulo);

        // Llama al método calcularArea()
        double areaCalculada = miTriangulo.calcularArea();
        System.out.println("Área del triángulo: " + areaCalculada);
    }

    @Override
    public void dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



    

