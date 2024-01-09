package LevelUpQuestions;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {7,2,4,1,5};
        int n = arr.length;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0 ; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
