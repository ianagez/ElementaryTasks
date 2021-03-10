package com.tasks.task2;

import java.util.Scanner;

public class Task2 extends Task{
    public Task2(Messenger messenger) {
        super(messenger);
    }

    @Override
    protected void run() {
        System.out.println("Let's check if envelopes fit one into another.");
        readSides();

    }
    public static void readSides(){
        String[] sideNames= {"a","b","c","d"};
        double[] sides=new double[4];

        for (int i = 0; i < sideNames.length; i++) {
            sides[i]=readOneSide(sideNames[i]);
        }

        // System.out.println(new Envelope(sides[0],sides[1]).putInto(new Envelope(sides[2],sides[3])));
        System.out.println
                (RectangleManipulator
                        .isFittedInto
                                (new Envelope(sides[0],sides[1]),new Envelope(sides[2],sides[3])));

        System.out.println("Would you like to continue?");
        String answer=readConsole();
        if(answer.equalsIgnoreCase("y")
                || answer.equalsIgnoreCase("yes")){
            readSides();
        }
    }

    public static double readOneSide(String sideName){
        System.out.println("Enter side "+sideName+".");
        String line=readConsole();
        double side;
        if(isDouble(line)){
            side=Double.parseDouble(line);
            if(side>0){ return side; }
            else { System.out.println("Height and width should be more than 0."); }
        } else {
            System.out.println("Height and width should be more than 0.");
        }
        return readOneSide(sideName);
    }

    public static String readConsole() {
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }

    public static boolean isDouble(String line){
        try {
            Double.parseDouble(line);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Wrong number format. Try again.");
        }
        return false;
    }
}
