package Dp;

public class Coin_change2_pc {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
//        System.out.println( Coin_Change(arr,amount,0)  );
        System.out.println( Coin_ChangeBU(coins,amount));
    }
    public static int Coin_Change(int[] arr,int amount,int i){

        if(amount==0){
            return 1;
        }
        if(i==arr.length){
            return 0;
        }

        int inclusion=0;
        int exclusion =0;
        if(amount>=arr[i]){
            inclusion = Coin_Change(arr,amount-arr[i],i);
        }
        exclusion=Coin_Change(arr,amount,i+1);
        return inclusion+exclusion;
    }

    public static int Coin_ChangeBU(int[] arr,int amount){
        int[][]  dp = new int[amount+1][arr.length];
        for(int i=0 ;i<dp[0].length ; i++){
            dp[0][i]=1;
        }
        for(int am=1;am<dp.length ; am++){
            for(int i=0;i<dp[0].length;i++){
                int inclusion=0;
                int exclusion =0;
                if(am>=arr[i]){
                    inclusion =  dp[am-arr[i]][i];
                }
                exclusion= dp[am][i];
                dp[am][i] = inclusion+exclusion ;
            }
        }



        return   dp[amount][arr.length-1];
    }
}
