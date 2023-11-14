package Dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        System.out.println( lengthOfLIS(nums,dp));
    }
    public static int lengthOfLIS(int[] nums,int[] dp) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]= Math.max(dp[i],(dp[j]+1));
                }
            }
        }
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;
    }
}
