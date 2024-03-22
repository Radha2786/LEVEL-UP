package Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5 , 2,3,1};
        int b[] = sort(a);
        System.out.println(Arrays.toString(a) + " got sorted into ---> " + Arrays.toString(b));
    }
    public static int[] sort(int[] arr){

        // when reached length 1
        if(arr.length==1){
            return arr;
        }
        // dividing step
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        // merging step
        return Merge(left,right);

    }
    public static int[] Merge(int[] left, int[] right){
        int[] mix = new int[left.length+ right.length];
        int i=0, j=0 , k=0;
        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
                mix[k++]=left[i++];
            }else{
                mix[k++]=right[j++];
            }
        }
        while(i<left.length){
            mix[k++]=left[i++];
        }
        while (j<right.length){
            mix[k++]=right[j++];
        }
        return mix;
    }
}
