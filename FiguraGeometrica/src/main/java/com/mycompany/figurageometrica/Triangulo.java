
package com.mycompany.figurageometrica;


public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    public double obtenerPerimetro() {
        // Suponemos un triángulo equilátero para simplificar
        return 3 * base;
    }
}
