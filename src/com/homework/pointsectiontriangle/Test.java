package com.homework.pointsectiontriangle;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,4);
        Point point3 = new Point(-1,2);

       Triangle triangle1 = new Triangle();
       boolean isTriangle = triangle1.constructTriangle(point1,point2,point3);

       if(isTriangle){
           System.out.println("You can construct a triangle from: ");
           System.out.println("Point1: " + point1.getX()+ " , " + point1.getY()
                   + " Point2: " + point2.getX()+ " , " + point2.getY()
                   + " Point3: " + point3.getX()+ " , " + point3.getY());
       } else {
           System.out.println("You cannot construct triangle from provided points.");
       }

    }

}
