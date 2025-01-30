// 672115045 Virawit Kongthong OOP Lab7 Question 1

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s, s1, s2, s3, color, f;
        boolean filled = false;
        System.out.println("Enter three integer values for the triangle's sides: ");
        s = input.nextLine();
        String[] userInput = s.split("\\s+");
        System.out.println("Enter the color: ");
        color = input.nextLine();
        System.out.println("Enter a boolean for filled: ");
        f = input.nextLine();

        if (f.toLowerCase().equals("true")) {
            filled = true;
        } else {
            filled = false;
        }

        s1 = userInput[0];
        s2 = userInput[1];
        s3 = userInput[2];

        GeometricObject test = new Triangle(s1, s2, s3, color, filled);

        System.out.println("The area is " + test.getArea());
        System.out.println("The perimeter is " + test.getPerimeter());
        System.out.println("The color of the triangle is " + test.getColor());
        System.out.println("Filled: " + test.isFilled());
        System.out.println("Side 1 = " + s1 + " Side 2 = " + s2 + " Side 3 = " + s3);

    }
}

class Triangle extends GeometricObject{
    private double s1, s2, s3;
    private boolean filled;
    private String color;

    public Triangle(String s1, String s2, String s3, String color, boolean filled) {
        super(color, filled);
        this.s1 = Double.valueOf(s1);
        this.s2 = Double.valueOf(s2);
        this.s3 = Double.valueOf(s3);    
    }

    public double getArea() {
        double sP = getPerimeter() / 2;
        return Math.sqrt(sP*(sP-s1)*(sP-s2)*(sP-s3));
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    public void printSides() {
        System.out.println("Triangle sides: side1 = " + s1 + " side2 = " + s2 + " side3 = " + s3);
    }
}