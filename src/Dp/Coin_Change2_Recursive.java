package Dp;

public class Coin_Change2_Recursive {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int target = 5;
        System.out.println(CoinChange(arr,target,0));
    }
    public static int CoinChange(int[] arr,int target,int index){
        if(target==0){
            return 1;
        }
        if(index==arr.length){
            return 0;
        }
        int choose=0;
        int notchoose=0;
        // inclusive
        if(target>=arr[index]){
         choose= CoinChange(arr,target-arr[index],index);
        }
         notchoose=CoinChange(arr,target,index+1);
        return choose + notchoose;

    }
}
