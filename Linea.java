package com.mycompany.formas;

public class Linea extends Formas{
    private final double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    // Metodo para obtener el largo de la linea
    public double obtenerLargo() {
        return largo;
    }

    public static void main(String[] args) {
        double largoLinea = 20.0; // Longitud de la linea (puedes cambiar este valor)
        Linea miLinea = new Linea(largoLinea);

        // Obten el largo de la linea
        double largoCalculado = miLinea.obtenerLargo();
        System.out.println("Longitud de la linea: " + largoCalculado);
    }

    @Override
    public void dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

