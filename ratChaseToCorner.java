import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char ques[][] = new char[N][M];
        for(int i=0; i<N; i++){
            String st = sc.next();
            for(int j=0; j<M; j++){
                ques[i][j] = st.charAt(j);

            }
        }

        int ans[][] = new int[N][M];
    
        boolean flag[] = new boolean[1];
        mazePath(ques,ans,0,0,flag);
        if(!flag[0]) System.out.print("NO PATH FOUND");
        


    }

    public static void mazePath(char ques[][], int ans[][], int i, int j, boolean flag[]){
        if(i<0 || j<0 || j>=ques[0].length || i>=ques.length || ques[i][j]=='X'){
            return;
        }
            if((i == ques.length-1) && (j == ques[0].length-1)){
                ans[i][j] = 1;
                flag[0] = true;
                
                display(ans);               
            }
                ques[i][j] = 'X';
                ans[i][j] = 1;
                mazePath(ques, ans,i,j+1,flag);            
                mazePath(ques, ans, i+1 , j,flag);                       
                mazePath(ques, ans,i,j-1,flag);                        
                mazePath(ques, ans, i-1 , j,flag);
                ques[i][j] = 'O';
                ans[i][j] = 0;
             
    }
    public static void display(int ans[][]){
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// https://codeskiller.codingblocks.com/problems/535
// assume current as path and send all calls;
// bc1 : make right base cases that i,j shouldn't cross limits;
// bc2 : if reached corner display ans;
// if never hit display means "NO PATH FOUND"
// undo assumed path after all calls cz in any frame if no calls went further means we are at wrong path so backtrack 
