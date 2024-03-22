package Sliding_Window;

public class sliding_window_of_size_k {
    public static void main(String[] args) {
        int[] arr = {2,7,3,5,8,1};
        int k = 3;
        int ans=MaxSubarraySum(arr,k);
        System.out.println(ans);
    }
    public static int MaxSubarraySum(int[] arr , int k){
        int maxWindow=0;
        int maxsum=0;
        int start=0;
        int end=0;
        for(end=0; end<arr.length ; end++){
            maxWindow+=arr[end];
            if(end>=k-1){
                maxsum = Math.max(maxsum, maxWindow);
                maxWindow= maxWindow-arr[start];
                start++;
            }
        }
        return maxsum;

    }
}
