        

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import myBoard.Board;

enum Symbols {
    Z,
    X,
    O
}

class Player {
    
}





class Game {
    
    Board board;
    Player p1;
    Player p2;
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Board board = new Board(3);
		board.print();
	}
}
