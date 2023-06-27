class Solution {

    private static final int BOARD_SIZE = 9;
    private static final char EMPTY_CELL = '.';
    
    public void solveSudoku(char[][] board) {
        if (board == null || board.length != BOARD_SIZE || board[0].length != BOARD_SIZE) {
            throw new IllegalArgumentException("Invalid Sudoku board.");
        }

        solve(board);
    }

      private boolean solve(char[][] board) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col] == EMPTY_CELL) {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solve(board)) {
                                return true;
                            } else {
                                // Undo the current choice
                                board[row][col] = EMPTY_CELL;
                            }
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // All cells filled (base case)
    }

     private boolean isValid(char[][] board, int row, int col, char num) {
        // Check row
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 sub-box
        int subBoxRowStart = 3 * (row / 3);
        int subBoxColStart = 3 * (col / 3);
        for (int i = subBoxRowStart; i < subBoxRowStart + 3; i++) {
            for (int j = subBoxColStart; j < subBoxColStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true; // Valid number
     }
}