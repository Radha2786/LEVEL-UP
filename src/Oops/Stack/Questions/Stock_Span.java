package Oops.Stack.Questions;

import java.util.*;

public class Stock_Span {
    public static void main(String[] args) {
        int[] arr ={91,11,13,15,38,42,37};
        System.out.println( Arrays.toString(Span_cal(arr)));
    }
    public static int[] Span_cal(int[] arr){
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while (!st.isEmpty() && arr[i]>=arr[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);

        }
        return span;
    }
}
