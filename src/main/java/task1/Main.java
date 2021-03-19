package task1;

public class Main {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("It should be 2 arguments.");
            return;
        }
        int height=Integer.parseInt(args[0]);
        int width=Integer.parseInt(args[1]);

        if(height<=0 || width<=0){
            System.out.println("Height and width should be more than 0.");
            return;
        }
        ChessBoard chessBoard=new ChessBoard(height,width);
        chessBoard.draw();
    }
}
