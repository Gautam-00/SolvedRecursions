package RecurssionAndBacktracking;

public class WordSearch {

	public static void main(String[] args) {
		
		char board[][] = {{'A','B','C','E'},
						  {'S','F','C','S'},
						  {'A','D','E','E'}};
		String word = "ABCCED";
//        Recurr(board, word, 0,0,0);
		
        for(int i=0; i<board.length; i++) {
        	for(int j=0; j<board[0].length; j++) {
        		if(board[i][j] == word.charAt(0)) {
        			boolean ans = Recurr(board, word, i,j,0);
        			if(ans) System.out.println(ans);
        			return;
        		}
        	}
        }
		System.out.println(false);
		

	}
	
	public static boolean Recurr( char ques[][], String word, int i, int j, int idx) {
		if(idx==word.length()) {			
			return true;
		}
		if(i<0 || j<0 || i >= ques.length || j >= ques.length || ques[i][j] != word.charAt(idx) ) {
			return false;
		}
		
		ques[i][j] = '.';
		int rw[] = {0,-1,0,1};
        int cl[] = {1,0,-1,0};
		for(int k=0; k<4; k++) {
			boolean ans = Recurr(ques, word, i+rw[k], j+cl[k], idx+1);
			if(ans) return ans;
		}
		ques[i][j] = word.charAt(idx);
		return false;
	}

}
// before calling the recurssive function first find the first char for the word and make call from where first char of the word is found;
// after that its like ratchase its path like ques : jaha se start kiya usko block krke charo or call lgao n agr true aagail tw ans milgail return hojo;
// block ko undo kro n  na milal sara calls  =k baad toh return false; 
