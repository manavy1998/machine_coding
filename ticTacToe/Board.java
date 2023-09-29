

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
    
    public void getSize(){
        return this.matrix.length;
    }
    
}