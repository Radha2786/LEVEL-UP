package Dp;

import java.util.Arrays;

public class Coin_Change_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int target=5;
        int[][] dp = new int[target+1][arr.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
//        System.out.println( Combinations(arr,target,0));
        System.out.println( Memoisation(arr,target,0,dp));
    }
    // SIMPLE RECURSIVE SOLUTION
    public static int Combinations(int[] arr,int target,int index){
        if(target<0){
            return 0;
        }
        if(target==0){
            return 1;
        }
        int choose=0,notchoose=0;
        if(index<arr.length) {
            choose=Combinations(arr, target - arr[index], index);

            notchoose = Combinations(arr, target, index + 1);
        }
        return choose + notchoose;
    }

     public static int Memoisation(int[] arr,int target,int index,int[][] dp){
         if(target<0){
             return 0;
         }
         if(target==0){
             return 1;
         }
         if(index<arr.length) {


             if (dp[target][index] != -1) {
                 return dp[target][index];
             }
         }
         int choose=0,notchoose=0;
         if(index<arr.length) {
             choose=Memoisation(arr, target - arr[index], index,dp);

             notchoose = Memoisation(arr, target, index + 1,dp);
             dp[target][index]=choose+notchoose;
         }

         return choose + notchoose;
     }
}
