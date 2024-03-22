package Oops.Stack.Questions;
import java.util.*;
public class Sum_of_subarray_minimum {
    public static void main(String[] args) {
       int[] arr = {3,1,2,4};
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                min= Math.min(min,arr[j]);
                sum=sum+min;
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
