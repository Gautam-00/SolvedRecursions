class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        generate(board, 0);
        return res;
    }
    public void generate(char[][] board, int row) {
        if (row == board.length) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                list.add(new String(board[i]));
            }
            res.add(list);
            return;
        }
        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                generate(board, row + 1);
                board[row][col] = '.'; 
            }
        }
    }
   public static boolean isSafe(boolean board[][], int i, int j) {
     // up
		int row = i;
		while(row >= 0){
          if(board[row][j]) return false;
          row--;
       }
        row = i;
        int col =j;
     // left 
      while(row >= 0 && col >= 0){
          if(board[row][col]) return false;
          row--; col--;
      }
// right 
      row = i;
      col =j;
      while(row >= 0 && col < board.length){
          if(board[row][col]) return false;
          row--; col++;
      }
      return true;

	}
}


// each row meh bss ek print krna h toh place krte sath hi row+1;
// isSafe : only cz we are placing from up-down n left-right so to check if curr position isSafe we only need to check into 3 directions (only 3 directions can have another placed Qn);
// if(IsSafe(curr) tw call lgao jme n-1,row+1 mtlb qn place krdiye n is position ko mark krdo; and backtrack k liye call k baad unmark krdo;
// jaha sara queens placed vyo uha print/add krdo uss matrix ko new bna k and sb undo krke explore other possibilities; if fst qns place kre k sara possibility khtm means end of loop n end of prog
