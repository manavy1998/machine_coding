public class Validate {
    
    public static boolean validMove(Symbols matrix [][], int row, int col){
        int size = matrix.length;
        String error;
        boolean flag = false;
        if (((row < 0) || (row > size)) || ((col < 0) || (col > size))){
            error = "Value out of bounce";
            flag = true;
        }
        else if(matrix[row][col] != Symbols.Z){
            error = "Value already set at this position";
            flag = true;
        }

        if (!flag){
            Service.print(error);
            return false;
        }

        else{
            return true;
        }

    }

    public static boolean matchRow(Symbols[][] matrix, Symbols symbol, int row) {
        int size  = matrix.length;
        
        for (int i = 0; i < size; i++){
            if (matrix[row][i] != symbol){
                return false;
            }
        }

        return true;
    }

    public static boolean matchDiag(Symbols[][] matrix, Symbols symbol) {
        int size  = matrix.length;
        
        for (int i = 0; i < size; i++){
            if (matrix[i][i] != symbol){
                return false;
            }
        }

        return true;
    }

    public static boolean matchCol(Symbols[][] matrix, Symbols symbol, int col) {
        int size  = matrix.length;
        
        for (int i = 0; i < size; i++){
            if (matrix[i][col] != symbol){
                return false;
            }
        }

        return true;
    }

    public static boolean matchDiagRev(Symbols[][] matrix, Symbols symbol) {
        int size  = matrix.length;
        
        for (int i = 0; i < size; i++){
            if (matrix[i][size-i] != symbol){
                return false;
            }
        }

        return true;
    }
    
}
