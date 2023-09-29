
public class Player {
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