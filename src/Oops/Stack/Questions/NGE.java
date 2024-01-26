package Oops.Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int[] arr = {11,2,3,23,13,9,15};
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int index = st.pop();
                ans[index]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int index = st.pop();
            ans[index]=-1;
        }
        System.out.println(Arrays.toString(ans));
    }
}
