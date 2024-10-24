public class Sudoku {

    private final int tam = 9;
    private int[][] board;

    public Sudoku(int[][] board) {
        if(board.length != tam || board[0].length != tam){
            throw new IllegalArgumentException();
        }

        this.board = board;
    }


    public Sudoku solucionar(){
        return null;
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
    }


}
