package RecurssionAndBacktracking;

public class QueenCombination {
	public static void main(String[] args) {
		int tq = 2;
		boolean b[] = new boolean[4];
		Combination(b,tq,0,"",0);

	}
	public static void Combination(boolean[] board, int tq, int qpsf, String ans, int idx) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i=idx; i<board.length;i++){
			if(!board[i]) {
				board[i] = true;
				Combination(board, tq, qpsf+1, ans+'b'+i+'q'+qpsf, idx+1);
				board[i]=false;
			}
		}
	}
}

// n qns n box meh bara san tw kno qn kno v box meh hoko sb k same manna h cz its the same combination nu kno kenau rho;
// isko implement krne k liye will maintain a index ki jaha tk hogail ba santh ganth okra aage se baki k combo bnao cz pixe wla leke aibe tw math kr jai cz
// tora se paila jb pixe wla k pali rhe tb tora se combo bna leke ba already tw okre lge tu jake fen combo bnaibe tw same nikli oise maintained an index/
// and make calls okra aage se;; jaha bari okra aage se bss combo bnaibe tw repeateds remove hojai;;
