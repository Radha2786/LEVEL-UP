package Dp;
import java.util.*;

public class NumberofLongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        int n = nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]= Math.max(dp[i],(dp[j]+1));
                    if(dp[i]>max){
                        max=dp[i];
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<dp.length-1 ; i++){
            if(dp[i]==max && dp[i]==dp[i+1] ){
                count++;
            }
        }
        System.out.print(count);
    }
}
