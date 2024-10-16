
package com.mycompany.figurageometrica;


public class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;
    
    
    public Rectangulo (String nombre, String color, double lado1, double lado2) {
        super (nombre,color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        
        
    }
}