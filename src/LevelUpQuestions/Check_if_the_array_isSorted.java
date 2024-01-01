package LevelUpQuestions;
import java.lang.reflect.Array;
import java.util.*;

public class Check_if_the_array_isSorted {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(check(nums));

    }
    public static boolean check(int[] nums) {
        // only 1 pair should exist with the condition (condition --> nums[i-1]>nums[i] )
        int count =0;
        int n = nums.length-1;
        for(int i=1;i<nums.length ; i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[n]>nums[0]){
            count++;
        }
        if(count>=2) return false;

        return true;
    }
}
