package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0, Color.BLACK));
        myShapes.add(new Circle(2.0, Color.BLUE));
        
        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0, Color.RED));
        myCircles.add(new Circle(3.0, Color.RED));
        System.out.println("Total area: " + totalArea(myCircles));
        
    }
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s: list) {
			sum += s.area();
		}
		return sum;
	}
}
