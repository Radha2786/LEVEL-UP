package Dp;
import java.util.Arrays;
public class Consecutive1notallowed {
    public static void main(String[] args) {
        int n = 43;
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Count(n,dp));
    }

    private static long Count(int n,long[] dp)
    {
        if(n<=0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        // choose
        long choose_one = Count(n-2,dp);
        long not_choose=Count(n-1,dp);
        dp[n] = choose_one + not_choose;
        return choose_one + not_choose % 1000000007 ;

    }
}
