package com.tasks.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // TODO ZEROES CHECK
        //STRING LENGTH
        String StringNumber="40".trim();

        boolean isNegative=false;

        if(StringNumber.charAt(0)=='-'){
            isNegative=true;
            StringNumber=StringNumber.substring(0);
        }


        for (int i = 0; i < StringNumber.length(); i++) {
            if(StringNumber.charAt(0)=='0'){
                StringNumber=StringNumber.substring(0);
            }
            break;
        }

        printNumber(StringNumber, isNegative);

    }
    //todo boolean minus
    public static void printNumber(String numberString, boolean isNegative){

        Map<Integer,String> hashMapToNineteen=hashMapToNineteen = new HashMap<>();
        Map<Integer,String> hashMapDecades = new HashMap<Integer,String>();


        int number=Integer.parseInt(numberString);


        ArrayList<String> resultList=new ArrayList<>();
        if(isNegative){
            resultList.add("minus");
        }

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


        hashMapDecades.put(20,"twenty");
        hashMapDecades.put(30,"thirty");
        hashMapDecades.put(40,"forty");
        hashMapDecades.put(50,"fifty");
        hashMapDecades.put(60,"sixty");
        hashMapDecades.put(70,"seventy");
        hashMapDecades.put(80,"eighty");
        hashMapDecades.put(90,"ninety");


        String hundred="hundred";
        String thousand="thousand";

        if(number<20) {
            resultList.add(hashMapToNineteen.get(number));
        }else if(number>19 && number<100){
            char hundredValue=numberString.charAt(0);
            resultList.add(hashMapToNineteen.get(Integer.parseInt(String.valueOf(hundredValue))));
            resultList.add("hundred");
            String dec=numberString.substring(0);
            resultList.add(hashMapToNineteen.get(Integer.parseInt(dec)));
            //numberString.substring(0);
            String[] arr=resultList.toArray(new String[resultList.size()]);
            System.out.println(String.join(" ",arr));
        }
    }
}

