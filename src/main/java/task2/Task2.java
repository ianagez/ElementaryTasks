package task2;

import common.Messenger;
import common.Task;

public class Task2 extends Task {
    public Task2(Messenger messenger) {
        super(messenger);
    }

    @Override
    public void run() {
        messenger.sendMessage(StringConsts.FIRST_MESSAGE);
      double[] envelopeSides = getAllSides();
        if(isFittedIn(envelopeSides)){
            messenger.sendMessage(StringConsts.IS_FITTED);
        } else{
            messenger.sendMessage(StringConsts.IS_NOT_FITTED);
        }
        if(runOneMoreTime()){
            run();
           // return;
        } else messenger.sendMessage(StringConsts.BYE);
    }

    private double[] getAllSides(){
        String[] sideNames= StringConsts.SIDE_NAMES;
        double[] sides=new double[sideNames.length];
        for (int i = 0; i < sideNames.length; i++) {
            sides[i]= getOneSide(sideNames[i]);
        }
        return sides;
    }

    private  double getOneSide(String sideName){
        messenger.sendMessage(StringConsts.ENTER_SIDE+" "+sideName+".");
        String line=messenger.getMessage();
        double side;
        if(isDouble(line)){
            side=Double.parseDouble(line);
            if(side>0){ return side; }
            else { messenger.sendMessage(StringConsts.MORE_THAN_ZERO); }
        }
        return getOneSide(sideName);
    }

    private boolean isFittedIn(double[] sides){
      return RectangleManipulator
                        .isFittedInto
                                (new Envelope(sides[0],sides[1]),new Envelope(sides[2],sides[3]));
    }
    private boolean runOneMoreTime() {
        messenger.sendMessage(StringConsts.LIKE_TO_CONTINUE);
        String answer = messenger.getMessage();
        return answer.equalsIgnoreCase(StringConsts.Y)
                || answer.equalsIgnoreCase(StringConsts.YES);
    }

    private boolean isDouble(String line){
        try {
            Double.parseDouble(line);
            return true;
        }catch (NumberFormatException e){
            messenger.sendMessage(StringConsts.WRONG_NUMBER_FORMAT);
            return false;
        }
    }
}
