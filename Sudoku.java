public class Sudoku {

    private final int TAM = 9;
    private int[][] board;

    /**
     * Crea un nuevo objeto Sudoku
     * @param board la matriz de casillas iniciales. Aquellas vacías deber tener un 0
     * @throws IllegalArgumentException si la dimensión no es de 9x9
     */
    public Sudoku(int[][] board) {
        if(board.length != TAM || board[0].length != TAM)
            throw new IllegalArgumentException();

        this.board = board;
    }

    /**
     * Soluciona el Sudoku
     * @return un Sudoku completado
     */
    public Sudoku solucionar(){
        Sudoku sol = new Sudoku(board);


        //Ir a la primera casilla vacía

        //Poner un número y resolver ese nuevo por este método

        //Si falla incrementar uno el valor puesto y volver a resolver




        return this;
    }

    /**
     * Comprueba si el Sudoku está completo
     * @return true si todas las celdas tienen un valor (1-9) y false en caso contrario
     */
    public boolean completado(){
        for(int i = 0; i < TAM; i++)
            for(int j = 0; j < TAM; j++)
                if(this.board[i][j] == 0)
                    return false;

        return true;
    }

    /**
     * Comprueba si un valor para cierta celda dada es posible con la situación del sudoku
     * @param fil la fila de la celda a comprobar
     * @param col la columna de la celda a comprobar
     * @return true si la celda es posible y false en caso contrario
     */
    public boolean comprobarCelda(int fil, int col){
        int celda = this.board[fil][col];

        //Comprobar la fila
        for(int i = 0; i < TAM; i++)
            if(i != col && this.board[fil][i] == celda)
                return false;

        //Comprobar la columna
        for(int i = 0; i < TAM; i++)
            if(i != fil && this.board[i][col] == celda)
                return false;

        //Comprobar la subdivisión
        int filInicioSubdivison = (fil/3)*3;
        int colInicioSubdivison = (col/3)*3;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                if((i + filInicioSubdivison) != fil && (j + colInicioSubdivison) != col && this.board[filInicioSubdivison+i][colInicioSubdivison+j] == celda)
                    return false;

        return true;
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
