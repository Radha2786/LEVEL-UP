package POTD;
import  java.util.*;

public class MaximizeHappinessofSelectedChildren {
    public static void main(String[] args) {
        int[] happiness = {2,3,4,5};
        int k = 1;
        int i=0 , index=happiness.length-1;
        int ans =0;
        Arrays.sort(happiness);
        while(i<k){
            ans+=happiness[index];
            happiness[index]=0;
           int[] arr = Decrement(happiness);
           happiness=arr;
            index--;
            i++;
        }
//        return ans;
        System.out.println(ans);
    }
    public static int[] Decrement(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[i]=arr[i]-1;
            }
        }
        return arr;
    }
}
