class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ll = new ArrayList<>();
        List<String> l = new ArrayList<>();
        Recurr(s,ll,l);
        return ll;
    }

public static void Recurr(String ques, List<List<String>> ll, List<String> l){
    if(ques == ""){
        ll.add(new ArrayList<>(l));
        return;
    }

    for(int i=1; i<=ques.length(); i++){
        String s = ques.substring(0,i);
        if(palin(s)) {
            l.add(s);
            Recurr(ques.substring(i) , ll , l);
            l.remove(l.size()-1);
        }
    }
}
    public static boolean palin(String str){
		StringBuilder st = new StringBuilder(str);
        if(str.equals(""+st.reverse())) return true;
        return false;
    }
}



// saar : ques = str.substring(i); ans = str.substring(0,i) ; check ans to be palindrome before adding; i=1 to= str.length();
// ques : aise partions krne h string k ki har part khudme palindrome ho; soln : generate all possible partitions and collect only those who make ans;
// approach : make fst cut at (0,1) and send rest string as ques for nest recurssive call and check if the current cut is a palindrome cz then only further calls; 
