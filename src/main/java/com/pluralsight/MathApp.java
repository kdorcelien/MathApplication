package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        long bobSalary = 70000;
        long garySalary = 90000;
        long highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("the highest salary is" + ": " + highestSalary);

        int carPrice = 2000;
        double truckPrice = 10000;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("the lowest price is" + ":" + lowestPrice);

        double circleCirc = 7.25;
        double area = Math.PI * circleCirc * circleCirc;
        System.out.println("The area of the circle with radius " + circleCirc + " is: " + area);

        double var = 5.0;
        double squareRoot = Math.sqrt(var);
        System.out.println("The square root of" + " " + var + " " + "is" + " " + squareRoot);

        // Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distanceA = x2 - x1;
        double distanceB = y2 - y1;
        double distanceASquared = Math.pow(distanceA, 2);
        double distanceBSquared = Math.pow(distanceB, 2);
        double sumOfSquares = distanceASquared + distanceBSquared;
        double distance = Math.sqrt(sumOfSquares);
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
    }
}