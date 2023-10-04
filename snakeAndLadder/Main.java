import java.util.Queue;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Player{
    User user;
    Block block;

    public Player(User user){
        this.user = user;
    }

    public Block getBlock(){
        return this.block;
    }

    public void setBlock(Block block){
        this.block = block;
    }

}

class Game {
    private Board board;
    private List<Dice> dice;
    private Queue<Player> players;

    public Game(User users[], int boardWidth, int boardHeight, int diceQt){
        for (User user : users) {
            Player player = new Player(user);
            this.players.add(player);
        }

        this.board = new BoardBasic(boardHeight, boardWidth);

        for(int i = 0; i < diceQt; i++){
            this.dice.add(new Dice());
        }
        
    }



    public void pushPlayer(){

    }

    public void popPlayer(){

    }

    public void diaplay(){

    }

    public void start(){

    }

    public void turn(){

    }

    public void finish(){

    }

    public void play(){

    }

}

class Display {

}

class User {
    private String name;
    private String id;

    public User(String name){
        this.name = name;
    }

}

interface Board {
    
    int getSize();
    int getHeight();
    int getWidth();
    Interaction getInteraction();
    void setInteraction();
    Block getBlock();

}
// DOUBT! How to make set interactions independent of snake and ladder. 
//Can the interface be made into an abstract class? Check the methods.
class BoardBasic implements Board {
    private int height;
    private int width;
    private int blocksQt;
    private Block blocks[];

    public BoardBasic(int height, int width){
        this.height = height;
        this.width = width;
        this.blocksQt = height * width;
        this.blocks = new Block[this.blocksQt];

        for (Block block : blocks) {
            block = new Block();
        }

        setSnakes();

        setLadders();
    }

    private void setSnakes(){
        System.out.print("Please enter the number of snakes you want in the game: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            boolean flag = false;
            while(!flag){
                System.out.println("Please enter the head of the snake: ");
                int h = 
            }
        }
    }

    private void setLadders(){

    }

    public int getSize(){
        return this.blocksQt;
        
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public Block getBlock(int position){
        if ((position >= 0) && (position <= this.blocksQt) ){
            return blocks[position];
        }
        else{
            return null;
        }
    }

    @Override
    public Interaction getInteraction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInteraction'");
    }

    @Override
    public void setInteraction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setInteraction'");
    }

    

}

class Block {
    
    private Interaction interaction;


    public Interaction getInteraction(){
        return this.interaction;
    }

    public void setInteraction(Interaction interaction){
        this.interaction = interaction;
    }

}


interface Interaction {
    void setHead();
    void setTail();
    Interaction getInteraction();


}

class Snake implements Interaction {
    private static final String flow = "HT";
    Block head;
    Block tail;
}

class Ladder implements Interaction {
    private static final String flow = "TH";
    Block head;
    Block tail;
}

class Dice {
    public int roll(){

    }
}

class Main {
    public static void main (String args[]){
        User p1 = new User("Manav");
        User p2 = new User("Rishi");
        Game game1 = new Game();

    }
}