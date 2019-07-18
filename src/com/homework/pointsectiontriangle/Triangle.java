package com.homework.pointsectiontriangle;

public class Triangle {

    public boolean constructTriangle(Point point1, Point point2, Point point3){
        Section section1 = new Section(point1, point2);
        Section section2 = new Section(point2, point3);
        Section section3 = new Section(point3, point1);
        double length1 = section1.sectionLength();
        double length2 = section2.sectionLength();
        double length3 = section3.sectionLength();

        return (length1+length2)>length3 ||(length2+length3)>length1 ||(length1+length3)>length2;
    }
}
