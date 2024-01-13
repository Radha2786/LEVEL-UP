package Dp;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2= "ace";
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        System.out.println(lcs(text1,text2,0,0,dp));
    }
    public static int lcs(String text1, String text2,int i, int j,int[][] dp){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        // if character matches
        if(text1.charAt(i)==text2.charAt(j)) {
            ans = 1 + lcs(text1, text2, i + 1, j + 1,dp); // dp[i+1][j+1]
        }else{
            // ek baar b ko ignore karenge(ignoring character of text1)
            int fs = lcs(text1,text2,i+1,j,dp);  // dp[i+1][j]
            // ek baar c ko ignore karenge(ignoring character of text2)
            int ss = lcs(text1,text2,i,j+1,dp);  // dp[i][j+1]
            ans= Math.max(fs,ss);
        }
        dp[i][j]=ans;
        return ans;
    }

    // Bottom Up
    public static int BottomUp(String text1, String text2){
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                int ans=0;
            }
        }
        return 0;

    }

}
