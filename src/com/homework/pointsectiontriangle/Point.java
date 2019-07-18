package com.homework.pointsectiontriangle;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean checkMinusXplusY(){
        return x<0 && y>0;
    }

    public boolean checkMinusXminusY(){
        return x<0 && y<0;
    }

    public boolean checkPlusXplusY(){
        return x>0 && y>0;
    }

    public boolean checkPlusXminusY(){
        return x>0 && y<0;
    }

    public boolean checkX(){
        return x==0;
    }

    public boolean checkY(){
        return y==0;
    }

    public boolean check00(){
        return x==0 && y==0;
    }
}
