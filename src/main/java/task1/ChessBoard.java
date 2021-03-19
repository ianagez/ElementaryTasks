package task1;

public class ChessBoard {
    private int height;
    private int width;

    public ChessBoard(int height, int width){
        this.height=height;
        this.width=width;
    }

    public void draw(){
        char even='*';
        char odd=' ';
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(j%2==0){
                    System.out.print(even);
                }else
                    System.out.print(odd);
            }
            System.out.println();
            char temp=even;
            even=odd;
            odd=temp;
        }
    }
}
