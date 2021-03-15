package com.tasks.task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> hashMapToNineteen = new HashMap<>();
        Map<Integer,String> hashMapDecades = new HashMap<Integer,String>();

        hashMapToNineteen.put(0,"zero");
        hashMapToNineteen.put(1,"one");
        hashMapToNineteen.put(2,"two");
        hashMapToNineteen.put(3,"tree");
        hashMapToNineteen.put(4,"four");
        hashMapToNineteen.put(5,"five");
        hashMapToNineteen.put(6,"six");
        hashMapToNineteen.put(7,"seven");
        hashMapToNineteen.put(8,"eight");
        hashMapToNineteen.put(9,"nine");
        hashMapToNineteen.put(10,"ten");
        hashMapToNineteen.put(11,"eleven");
        hashMapToNineteen.put(12,"twelve");
        hashMapToNineteen.put(13,"thirteen");
        hashMapToNineteen.put(14,"fourteen");
        hashMapToNineteen.put(15,"fifteen");
        hashMapToNineteen.put(16,"sixteen");
        hashMapToNineteen.put(17,"seventeen");
        hashMapToNineteen.put(18,"eighteen");
        hashMapToNineteen.put(19,"nineteen");

        hashMapDecades.put(2,"twenty");
        hashMapDecades.put(3,"thirty");
        hashMapDecades.put(4,"forty");
        hashMapDecades.put(5,"fifty");
        hashMapDecades.put(6,"sixty");
        hashMapDecades.put(7,"seventy");
        hashMapDecades.put(8,"eighty");
        hashMapDecades.put(9,"ninety");
        // TODO ZEROES CHECK
        //STRING LENGTH
       // String StringNumber="40".trim();
        ArrayList<String> numberInWords=new ArrayList<>();


        int number=-1;

        if (number==0){
            numberInWords.add("zero");
        }else if(number<0){
            numberInWords.add("minus");
            number=Math.abs(number);
        }

        int numberLength = getNumberLength(number);
        if(numberLength==1){
            numberInWords.add(hashMapToNineteen.get(number));
        }else if(numberLength==2 && number<20){
            numberInWords.add(hashMapToNineteen.get(number));
        }else if(numberLength==2 && number>20){
            if(number%10==0) numberInWords.add(hashMapDecades.get(number));
            else {
                int dec=number/10;
                int units=number-dec*10;
                numberInWords.add(hashMapDecades.get(dec));
                numberInWords.add(hashMapToNineteen.get(units));
            }
        }
        for (String s: numberInWords) {
            System.out.println(s);
        }
    }
    public static int getNumberLength(int number){
        int numberLength=0;
        while (number>0){
            number=number/10;
            numberLength++;
        }
        return numberLength;
    }
}

