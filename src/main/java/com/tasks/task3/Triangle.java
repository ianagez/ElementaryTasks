package com.tasks.task3;

public class Triangle implements Comparable<Triangle> {
    private final String name;
    private final double side1;
    private final double side2;
    private final double side3;
    private double area;

    public Triangle(String name,double side1,double side2,double side3){
        this.name=name;
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.area=calculateArea();
    }
    private double calculateArea(){
        double p=(side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public int compareTo(Triangle o) {
        if(Math.abs(this.area-o.area)<0.0001)
            return 0;
        else if(this.area<o.area)
            return 1;
        else
            return -1;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return String.valueOf(this.area);
        return this.name+" "+this.area;
    }
}
