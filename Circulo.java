
package com.mycompany.formas;

public class Circulo extends Formas{
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementa el metodo calcularArea()
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        double radio = 8.0;
        Circulo miCirculo = new Circulo(radio);

        // Llama al metodo calcularArea()
        double area = miCirculo.calcularArea();
        System.out.println("Area del circulo: " + area);
    }

    @Override
      public void dibujar() {
        System.out.println("Dibuja un circulo");
    }

}

    

