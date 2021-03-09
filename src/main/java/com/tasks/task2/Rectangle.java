package com.tasks.task2;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getShortSide(){
        return Math.min(this.height, this.width);
    }
    public double getLongSide(){
        return Math.max(this.height, this.width);
    }
}
