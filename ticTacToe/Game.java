public class Game {
    
    Board board;
    Player p1;
    Player p2;
    int chances;
    State state;
    
    public Game(Board board, Player p1, Player p2){
        
        this.board = board;
        this.p1 = p1;
        this.p2 = p2;
        this.chances = 0;
        this.state = State.INIT;
        
    }

    public int getChances(){
        return this.chances;
    }

    public void incChances(){
        this.chances++;
        return;
    }
    
    public void start(){
        int size = this.board.getSize();
               
    }
}