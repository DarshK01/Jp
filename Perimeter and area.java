package com.mycompany.areaandperimeterofsquareandrectangle;

public class AreaAndPerimeterOfSquareAndRectangle {

    public static void main(String[] args) {
        int length = 5, side = 5, width = 5;
        int SquareArea, RectangleArea;
        int perimeterSq, perimeterRec;

        SquareArea = side * side;
        RectangleArea = length * width;
        perimeterRec = 2 * (length + width);
        perimeterSq = 4 * side;

        System.out.println("Area of square is: " + SquareArea);
        System.out.println("Area of rectangle is: " + RectangleArea);
        System.out.println("Perimeter of square is: " + perimeterSq);
        System.out.println("Perimeter of rectangle is: " + perimeterRec);
    }
}
