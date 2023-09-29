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
        return false;
    }

    public static boolean matchDiag(Symbols[][] matrix, Symbols symbol) {
        return false;
    }

    public static boolean matchCol(Symbols[][] matrix, Symbols symbol, int col) {
        return false;
    }

    public static boolean matchDiagRev(Symbols[][] matrix, Symbols symbol) {
        return false;
    }
    
}
