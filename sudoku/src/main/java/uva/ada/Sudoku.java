package uva.ada;

public class Sudoku {

    private final int TAM = 9;
    private int[][] tablero;

    /**
     * Crea un nuevo objeto Sudoku
     * @param tablero la matriz de casillas iniciales. Aquellas vacías deber tener un 0
     * @throws IllegalArgumentException si la dimensión no es de 9x9
     */
    public Sudoku(int[][] tablero) {
        if(tablero.length != TAM || tablero[0].length != TAM)
            throw new IllegalArgumentException();

        this.tablero = tablero;
    }

    /**
     * Soluciona el Sudoku
     * @return un Sudoku completado
     */
    public Sudoku solucionar(){
        Sudoku sol = new Sudoku(tablero);

        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                if(sol.tablero[i][j] == 0){  //Se avanza hasta el primer 0
                    for(int k = 1; k <= 9; k++){
                        sol.tablero[i][j] = k;
                        if(sol.comprobarCelda(i, j)){
                            if(sol.completado()){
                                return sol;
                            }
                            else{
                                Sudoku resultado = sol.solucionar();

                                if(resultado != null){
                                    return resultado;
                                }
                            }
                        }

                        sol.tablero[i][j] = 0;    //Resetear la celda
                    }

                    return null;    //Para que el backtracking no continue por aquí
                }
            }
        }

        return sol;
    }

    /**
     * Comprueba si el Sudoku está completo
     * @return true si todas las celdas tienen un valor (1-9) y false en caso contrario
     */
    public boolean completado(){
        for(int i = 0; i < TAM; i++)
            for(int j = 0; j < TAM; j++)
                if(this.tablero[i][j] == 0)
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
        int celda = this.tablero[fil][col];

        //Comprobar la fila
        for(int i = 0; i < TAM; i++)
            if(i != col && this.tablero[fil][i] == celda)
                return false;

        //Comprobar la columna
        for(int i = 0; i < TAM; i++)
            if(i != fil && this.tablero[i][col] == celda)
                return false;

        //Comprobar la subdivisión
        int filInicioSubdivison = (fil/3)*3;
        int colInicioSubdivison = (col/3)*3;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                if ((i + filInicioSubdivison != fil || j + colInicioSubdivison != col) && this.tablero[filInicioSubdivison + i][colInicioSubdivison + j] == celda)
                    return false;
        

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                sb.append(tablero[row][col] == 0 ? "." : tablero[row][col]);
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
        int[][] ejemplo = {
            {2, 0, 0, 1, 0, 0, 3, 0, 8},
            {0, 0, 7, 3, 4, 0, 0, 0, 1},
            {0, 0, 0, 0, 6, 0, 0, 0, 0},
            {3, 4, 5, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 8, 0, 1, 0, 0, 0},
            {8, 0, 0, 0, 7, 3, 0, 0, 0},
            {0, 0, 0, 0, 0, 5, 0, 0, 3},
            {0, 6, 2, 0, 3, 0, 0, 5, 0},
            {0, 0, 8, 0, 0, 0, 4, 0, 0}
        };

        Sudoku sudoku = new Sudoku(ejemplo);
        System.out.println(sudoku);
        System.out.println(sudoku.solucionar().toString());
    }
}
