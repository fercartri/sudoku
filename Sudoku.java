public class Sudoku {

    private final int tam = 9;
    private int[][] board;

    public Sudoku(int[][] board) {
        if(board.length != tam || board[0].length != tam)
            throw new IllegalArgumentException();

        this.board = board;
    }

    public Sudoku solucionar(){
        Sudoku sol = new Sudoku(board);




        return this;
    }

    public boolean completado(Sudoku s){
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                if(s.board[i][j] == 0){
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Comprueba si una celda es posible dada la situación del sudoku
     * @param fil la fila de la celda a comprobar
     * @param col la columna de la celda a comprobar
     * @return  true si la celda es posible y false en caso contrario
     */
    public boolean comprobarCelda(int fil, int col){
        int celda = this.board[fil][col];

        //Comprobar la fila
        for(int i = 0; i < tam; i++){
            if(i != col && this.board[fil][i] == celda){

            }
        }
        //Comprobar la columna


        //Comprobar la subdivisión
        
        return (this.comprobarFila(fil) && comprobarColumna(col) &&comprobarSubdivision(fil, col));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                sb.append(board[row][col] == 0 ? "." : board[row][col]);
                sb.append(" ");
                if ((col + 1) % 3 == 0 && col < 8) {
                    sb.append("| ");
                }
            }
            sb.append("\n");
            if ((row + 1) % 3 == 0 && row < 8) {
                sb.append("---------------------\n");
            }
        }
        return sb.toString();
    }






    public static void main(String[] args) {
        int[][] exampleBoard = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        Sudoku sudoku = new Sudoku(exampleBoard);
        System.out.println(sudoku);
        System.out.println(sudoku.solucionar().toString());
    }
}
