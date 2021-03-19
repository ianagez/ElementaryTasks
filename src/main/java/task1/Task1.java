package task1;

import common.Messenger;
import common.Task;

public class Task1 extends Task {
    public Task1(Messenger messenger,String[] args){
        super(messenger,args);
    }
    @Override
    public void run() {
        if(args.length!=2){
            System.out.println(StringConsts.IT_SHOULD_BE_TWO_ARGUMENTS);
            return;
        }
        int height=Integer.parseInt(args[0]);
        int width=Integer.parseInt(args[1]);

        if(height<=0 || width<=0){
            System.out.println(StringConsts.HEIGHT_AND_WIDTH_SHOULD_BE_MORE_THAN_0);
            return;
        }
        ChessBoard chessBoard=new ChessBoard(height,width);
        messenger.sendMessage(chessBoard.getChessBoardSchema());
    }
}
