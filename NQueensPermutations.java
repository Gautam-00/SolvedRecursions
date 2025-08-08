package RecurssionAndBacktracking;

public class QueenPermutation {

	public static void main(String[] args) {
		int tq =2;
		boolean b[] = new boolean[4];
		Permutation(b,tq,0,"");

	}
	public static void Permutation(boolean[] board, int tq, int qpsf, String ans) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i=0; i<board.length;i++){
			if(board[i]== false) {
				board[i] = true;
				Permutation(board, tq, qpsf+1, ans+'b'+i+'q'+qpsf);
				board[i]=false;
			}
		}
	}

}

// fst queen bitha k us position ko mark krke baki queens bithane k liye recurssion ko dedo bss; q0 tu bithao at b1 and baki queens empty jageh pe all possible jageh pe recurssion bithai n combination 
