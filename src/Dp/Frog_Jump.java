package Dp;

import java.util.* ;
import java.io.*;
public class Frog_Jump {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        while(n-->0){
            int[] dp = new int[heights.length];
            Arrays.fill(dp, -1);
            return frog_jump(heights, dp, heights.length-1);
        }
        return 0;

    }


    // Memoisation(Top-Down) Striver

    public static int frog_jump(int heights[],int[] dp,int index){
        if(index==0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }

        // left call
        int left=0;
        int right = Integer.MAX_VALUE ;
        left= frog_jump(heights, dp, index-1)+Math.abs(heights[index]-heights[index-1]);

        // right call
        if(index>1){
            right= frog_jump(heights, dp, index-2)+Math.abs(heights[index]-heights[index-2]);
        }
        dp[index]=Math.min(left,right);
        return Math.min(left, right);
    }


    // Tabulation
    public static int frog_jump2(int heights[],int[] dp,int index){
        int[] dp = new int[heights.length];
        dp[0]=0;

        int left=0;
        int right = Integer.MAX_VALUE ;

        for(int i=1;i<heights.length;i++){
            left = dp[i-1]+ Math.abs(heights[i]-heights[i-1]);
            if(i>1){
                right = dp[i-2]+ Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]= Math.min(left,right);
        }
        return dp[heights.length-1];

    }


}
