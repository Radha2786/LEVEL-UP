package Dp;

public class Coin_change2_pc {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int amount = 5;
        System.out.println( Coin_Change(arr,amount,0)  );
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
}
