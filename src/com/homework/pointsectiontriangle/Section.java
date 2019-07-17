package com.homework.pointsectiontriangle;

public class Section {
    private Point point1;
    private Point point2;

    public Section() {
    }

    public Section(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public double sectionLength(){
        double length = Math.sqrt((point2.getX()-point1.getX())*(point2.getX()-point1.getX())
                + ((point2.getY()-point1.getY())*(point2.getY()-point1.getY())));
        return length;
    }

}
