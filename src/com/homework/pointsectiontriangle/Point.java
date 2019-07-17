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
        if(x<0 && y>0){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMinusXminusY(){
        if(x<0 && y<0){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPlusXplusY(){
        if(x>0 && y>0){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPlusXminusY(){
        if(x>0 && y<0){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkX(){
        if(x==0){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkY(){
        if(y==0){
            return true;
        } else {
            return false;
        }
    }

    public boolean check00(){
        if(x==0 && y==0){
            return true;
        } else {
            return false;
        }
    }
}
