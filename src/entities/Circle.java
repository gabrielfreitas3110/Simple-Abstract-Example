/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.Color;

/**
 *
 * @author Gabriel Augusto
 */
public class Circle extends Shape {

    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    
}
