package com.tasks.task2;

public class Envelope {
    private double height;
    private double width;

    private double longSide;
    private double shortSide;
    private double area;


    public Envelope(double height,double width){

        this.height=height;
        this.width=width;
        area=height*width;
        longSide=Math.max(height,width);
        shortSide=Math.min(height,width);
    }

    public boolean infold(Envelope other){
        if(Math.abs(this.area-other.area) <0.001)
            return false;

        Envelope smaller=this.area<other.area ? this : other;
        Envelope bigger=this.area>other.area ? this : other;

        if(smaller.shortSide<bigger.shortSide && smaller.longSide<bigger.longSide)
            return true;

        // TODO calculate diagonal replacement
        return false;
    }
}
