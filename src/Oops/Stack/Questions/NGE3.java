package Oops.Stack.Questions;

import java.util.Arrays;

public class NGE3 {
    public static void main(String[] args) {
        int n=230241;
        System.out.println(nextGreaterElement(n));
    }
    public static int nextGreaterElement(int n) {
        char arr[] = (Integer.toString(n)).toCharArray();
        int len = arr.length;
        int firstdeflectionpoint=-1;
        int index=0;
        int index2=0;
        int currmax=Character.getNumericValue(arr[len - 1]);
        System.out.println(currmax);
        System.out.println("-----------------");
        for(int i=len-2 ; i>=0;i--){
            if(Character.getNumericValue(arr[i])<currmax){
                firstdeflectionpoint=Character.getNumericValue(arr[i]);
                index=i;
                break;
            }
            currmax=Character.getNumericValue(arr[i]);
        }
        if(firstdeflectionpoint==-1){
            return -1;
        }
        // first deflaction point mila hi ni mtlb decrease kahi decrease hi ni hua
        int seconddeflectionpoint=-1;
        for(int i=index+1;i<len;i++){
            if(Character.getNumericValue(arr[i]) > firstdeflectionpoint){
                seconddeflectionpoint=Character.getNumericValue(arr[i]);
                index2=i;
            }
        }
        if(seconddeflectionpoint==-1){
            return -1;
        }
        swap(index, index2,arr);
        Arrays.sort(arr, index+1, len);
        StringBuilder ans = new StringBuilder();
        for(int j=0;j<arr.length;j++){
            ans.append(arr[j]);
        }
//        int res= Integer.parseInt(ans.toString());
        long res= Long.parseLong(ans.toString());
//        return res;
        return (res > Integer.MAX_VALUE) ? -1 : (int) res;
    }
    static void swap(int i,int j,char[] arr)
    {
        char temp = arr[j];  // Removed unnecessary type casting
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

