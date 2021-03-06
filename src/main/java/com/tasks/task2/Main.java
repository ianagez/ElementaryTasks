package com.tasks.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        readSides();
    }

    public static void readSides(){
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            String[] sideNames= {"a","b","c","d"};
            double[] sides=new double[4];

            for (int i = 0; i < sideNames.length; i++) {
                sides[i]=readOneSide(reader,sideNames[i]);
            }

            System.out.println(new Envelope(sides[0],sides[1]).putInto(new Envelope(sides[2],sides[3])));

            System.out.println("Would you like to continue?");
            String answer=reader.readLine();
            if(answer.equalsIgnoreCase("y")
                    || answer.equalsIgnoreCase("yes")){
                readSides();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static double readOneSide(BufferedReader reader, String sideName) throws IOException{
        System.out.println("Enter side "+sideName+".");
        try {
            double side= Double.parseDouble(reader.readLine());
            if(side>0){
                return side;
            }
            else {
                System.out.println("Height and width should be more than 0.");
            }
        }catch (NumberFormatException e){
            System.out.println("Wrong number format. Try again.");
        }
        return readOneSide(reader,sideName);
    }
}
