package Dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
//        int first = Memoisation(cost,0,dp);
        Arrays.fill(dp,-1);
//        int second = Memoisation(cost,1,dp);
//        System.out.println(Math.min(first,second));

        System.out.println( tabulation(cost));

    }
    // By memoisation
    public static int Memoisation(int[] cost,int i,int[] dp) {
        // base condition
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }


//        call for i+1
        int f1=Memoisation(cost,i+1,dp);
        int f2 = Memoisation(cost,i+2,dp);
        dp[i]=Math.min(f1,f2)+cost[i];
        return dp[i];
    }

    // 2nd method bottom up approach (Tabulation)
    public static int tabulation(int[] cost){
       int[] dp = new int[cost.length];
       dp[0]=cost[0];
       dp[1]=cost[1];

       for(int i=2;i<cost.length;i++) {


//       int f1=       Memoisation(cost,i+1,dp);
           int f1 = dp[i - 1];
//        int f2 = Memoisation(cost,i+2,dp);
           int f2 = dp[i - 2];
           dp[i]=Math.min(f1,f2)+cost[i];
       }
       return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
