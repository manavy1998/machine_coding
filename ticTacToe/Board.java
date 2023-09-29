

public class Board {
    Symbols matrix [][];
    
    public Board(){
        int size = 3;
        matrix = new Symbols[size][size];
        this.setMatrix(matrix, size);
        return;
    }
    
    public Board(int size){
        matrix = new Symbols[size][size];
        this.setMatrix(matrix, size);
        return;
    }
    
    private void setMatrix(Symbols matrix [][], int size){
        for (int i=0; i<size ; i++ ){
            for (int j=0; j<size ; j++ ){
                matrix[i][j] = Symbols.Z;
            } 
        }
        return;
    }
    
    public void print(){
        int size = this.matrix.length;
        
        for (int i=0; i<size ; i++ ){
            for (int j=0; j<size ; j++ ){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        return;
    }
    
    public int getSize(){
        return this.matrix.length;
    }

    

    private void setSymbol(Symbols symbol, int row, int col){
        this.matrix[row][col] = symbol;
    }

    public boolean setMove(Symbols symbol, int row, int col){
        
        if(!Validate.validMove(this.matrix, row, col)){
            return false;
        }
        
        setSymbol(symbol, row, col);

        return true;
    }

    public boolean checkWin(Symbols symbol, int row, int col){

        if (Validate.matchRow(this.matrix, symbol, row)){return true;}
        else if (Validate.matchCol(this.matrix, symbol, col)){return true;}
        else if (Validate.matchDiag(this.matrix, symbol)){return true;}
        else if (Validate.matchDiagRev(this.matrix, symbol)){return true;}

        return false;
    }
    
}