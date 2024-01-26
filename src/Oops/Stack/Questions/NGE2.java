package Oops.Stack.Questions;

import java.util.Arrays;
import java.util.*;

public class NGE2 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = new int[nums.length];
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i< (2*n) ; i++){
            while(!st.isEmpty() && nums[i%n]>nums[st.peek()]){
                int index= st.pop();
                ans[index]=nums[i%n];
            }
            if(i<n) {


                st.push((i % n));
            }
        }
        while(!st.isEmpty()){
            int index = st.pop();
            ans[index]=-1;
        }
//        return ans;
        System.out.println(Arrays.toString(ans));
    }
}
