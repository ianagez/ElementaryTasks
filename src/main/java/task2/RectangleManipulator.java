package task2;

public class RectangleManipulator {

    public static boolean isFittedInto(Rectangle r1, Rectangle r2){
        Rectangle smaller=r1.getArea()<r2.getArea() ? r1 : r2;
        Rectangle bigger=r1.getArea()>r2.getArea() ? r1 : r2;

        if(smaller.getShortSide()<bigger.getShortSide() && smaller.getLongSide()<bigger.getLongSide())
            return true;

        return (bigger.getShortSide())>= ((2*smaller.getLongSide()*smaller.getShortSide()*bigger.getLongSide()
                +(Math.pow(smaller.getLongSide(),2)-Math.pow(smaller.getShortSide(),2))
                *Math.sqrt
                (Math.pow(smaller.getLongSide(), 2)+Math.pow(smaller.getShortSide(),2)-Math.pow(bigger.getLongSide(),2)))
                / (Math.pow(smaller.getLongSide(),2)+Math.pow(smaller.getShortSide(),2)));
    }
}
