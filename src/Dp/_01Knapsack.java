package Dp;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.util.Arrays;

public class _01Knapsack {
    public static void main(String[] args) {
        int cap=8;
        int wt[] ={1,4,2,3,6};
        int val[] = {1,1,7,9,1};
        int capacity=8;
        int[][] dp = new int[capacity+1][wt.length];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        System.out.println( knapsack(wt,val,capacity,0,dp));

    }

    // top down approach
    public static int knapsack(int[] wt, int[] val, int capacity, int index,int[][] dp){
        if(capacity==0 || index==wt.length){
            return 0;
        }
        if(dp[capacity][index]!=-1){
            return dp[capacity][index];
        }

        // inclusion
        int inclusion =0;
        int exclusion=0;
        if(capacity>=wt[index]){
            inclusion = val[index]+ knapsack(wt,val,capacity-wt[index],index+1,dp);  // dp[capacity-wt[index][index+1]]

        }
        // exclusion
        exclusion= knapsack(wt,val,capacity,index+1,dp);  // dp[capacity][index+1]
        dp[capacity][index]= Math.max(inclusion,exclusion);
        return Math.max(inclusion,exclusion);
    }


    // actual array m value ek index kam par present hogi weight array m cuz hum 1 extra assume krke chal rhe h(see diagram in copy)
}
