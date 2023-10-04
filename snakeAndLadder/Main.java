class Game {
    private Board board;
    private Dice dice;
    private Player p1;
    private Player p2;


}

class Player {
    private String name;
    private String id;

}

interface Board {
    

    void setSize();


}

class Block {
    private Player p1;
    private Player p2;
    private Interaction interaction;

    public Player getPlayer1(){
        return this.p1;
    }

    public void setPlayer1(Player p1){
        this.p1 = p1;
    }

    public Player getPlayer2(){
        return this.p2;
    }

    public void setPlayer2(Player p2){
        this.p2 = p2;
    }

    public Interaction getInteraction(){
        return this.interaction;
    }

    public void setInteraction(Interaction interaction){
        this.interaction = interaction;
    }

}

class BoardBasic implements Board {

}

interface Interaction {

}

class Snake implements Interaction {

}

class Ladder implements Interaction {

}

class Dice {

}

class Main {
    public static void main (String args[]){

    }
}