        

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



class Player {
    String name;
    Symbols symbol;
    
    public Player(String name, int num){
        this.name = name;
        if (num == 1){
            this.symbol = Symbols.X;
        }
        else{
            this.symbol = Symbols.O;
        }
        
    }
}





class Game {
    
    Board board;
    Player p1;
    Player p2;
    int chances;
    
    public Game(Board board, Player p1, Player p2){
        
        this.board = board;
        this.p1 = p1;
        this.p2 = p2;
        this.chances = 0;
        
    }
    
    public void start(){
        int size = this.board.getSize();
        
        
        
        
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Board board = new Board(3);
		board.print();
	}
}
