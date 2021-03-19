package task1;

public class ChessBoard {
    private int height;
    private int width;

    public ChessBoard(int height, int width){
        this.height=height;
        this.width=width;
    }

    public String getChessBoardSchema(){
        StringBuilder chessBoard=new StringBuilder();
        char even='*';
        char odd=' ';
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(j%2==0){
                    chessBoard.append(even);
                }else
                    chessBoard.append(odd);
            }
            if(i < height-1){
                chessBoard.append("\n");
            }
            char temp=even;
            even=odd;
            odd=temp;
        }
        return chessBoard.toString();
    }
}
