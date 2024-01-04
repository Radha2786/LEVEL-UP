package Dp;

import java.util.Arrays;

public class Ninjas_training {
    public static void main(String[] args) {
        int[][] arr ={{2,1,3},{3,4,6},{10,1,6},{8,3,7}};
        int n = arr.length;
        // what parameters are changing (day/index and last)
//        so we make dp array of N and 4
        int[][] dp = new int[n][4];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(Ninja(n-1,3,arr,dp));
    }
    public static int Ninja(int day,int last,int[][] arr,int[][] dp){

        if(dp[day][last]!=-1){
            return dp[day][last];
        }


        // writing base condition
        if(day==0){
            int maxi=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    maxi = Math.max(maxi,arr[0][task]);
                }
            }
            return maxi;
        }
        int maxi=0;
        for(int task=0;task<3;task++){
            if(task!=last)
            {
                int point = arr[day][task]+ Ninja(day-1,task,arr,dp);
                maxi=Math.max(maxi,point);
            }
        }
        dp[day][last]=maxi;
        return maxi;
    }
}
