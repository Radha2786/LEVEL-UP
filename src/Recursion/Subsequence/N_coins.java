package Recursion.Subsequence;

public class N_coins {
    public static void main(String[] args) {
        int N = 3;
//        Coins(N,"");
        Coins2(N,"");
    }
    public static void Coins(int N, String ans){
        if(N==0){
            System.out.println(ans);
            return ;
        }
        // call for head
        Coins(N-1,ans+"H");
        // call for tail
        Coins(N-1, ans + "T");
    }

    // No Two consecutive head should come together
    public static void Coins2(int N, String ans){
        if(N==0){
            System.out.println(ans);
            return ;
        }
        // call for head
        if( ans.length()==0 || ans.charAt(ans.length()-1)!='H' ){
            Coins2(N-1,ans+"H");
        }
        // call for tail
        Coins2(N-1, ans + "T");
    }

}
