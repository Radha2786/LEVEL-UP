package Dp;


public class Fibonacci {
    public static void main(String[] args) {
        int n=6;
//        System.out.println(Fibonnaci(n));
        int[] dp = new int[n+1];
        System.out.println( Memoisation(n,dp)); // top to down
        System.out.println(Tabulation(n,dp));
    }
    private static int Fibonnaci(int n) {
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        // first call for n-1
        int n1=Fibonnaci(n-1);
        // 2nd call for n-2
        int n2=Fibonnaci(n-2);
        return n1+n2;
    }

    // through Dynamic Programming
    public static int Memoisation(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        // call for n-1
        int n1=Memoisation(n-1,dp);

        // call for n-2
        int n2=Memoisation(n-2,dp);
        return dp[n]= n1+n2;
    }

    public static int Tabulation(int n,int[] dp){
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            // calculating n-1
            int n1= dp[i-1];
            // claculating n-2
            int n2 = dp[i-2];
            dp[i]=n1+n2;
        }
        return dp[n];
    }


}

