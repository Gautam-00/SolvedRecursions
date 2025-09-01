public class TOHonoi {

	public static void main(String[] args) {
		int n=3;
		String src = "A";
		String hlp = "B";
		String dest = "C";
		Toh(n,src,hlp,dest);
		System.out.println();
		ToH(n,src,dest,hlp);

	}
	public static void Toh(int n, String src, String hlp, String dest) {
		if(n==0) {
			return;
		}
		Toh(n-1,src,dest,hlp);
		System.out.println("Move " +n+ "th disk from "+ src + " to " + dest);
		Toh(n-1, hlp,src,dest);
	}
}

// step 1 : 1st call :  move n-1 disks from src to helper, take help of dest whereever needed;
// step 2 : move the only left disk at src i.e the nth disk from src to dest;
// step 3 : 2nd call : n-1 disks which are on the helper rod which 1st call did; take them all and keep at the destination jaha pe sbse last disk 2nd step ne dala h; 
// solved;;
// saar : main yei 3 steps hotey h krne ho given any n but there are many intermediate steps involved that which why helper rod is there cz only one can be moves n only placed at bigger,
// so we leave these intermediate steps on the recurssion to so it for us;; krke dega bharosa rkho; thats recurrsion;;
