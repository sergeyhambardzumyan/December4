package com.Homework6.Homework64;
//4
//Design a class named Point (կետ)
//	properties
//	- coordinateX
//	- coordinateY
//
//	methods
//	- distance()  (from 0:0 coordinate)
//	- distance(Point point) ( Overloaded method to get the distance between 2 points )
public class Point {
    private int coordinateX;
    private int coordinateY;

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double distance() {
        int xx = coordinateX * coordinateX;
        int yy = coordinateY * coordinateY;
        return Math.sqrt(xx  + yy );
    }

    public double distance(int x, int y) {
        int xx = coordinateX * coordinateX;
        int yy = coordinateY * coordinateY;
        return Math.sqrt((xx - x * x) + (yy - y * y));
    }

}
