package LevelUpQuestions;
import java.util.*;

// By Moore Voting algorithm
public class Majority_Element {
    public static void main(String[] args) {
        int[]  nums = {2,2,1,1,1,2,2};
        System.out.print(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int ele=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
            }
            if(nums[i]==ele){
                count++;
            }else{
                count--;
            }
        }

        // check if the element is actually the majority element
        return ele;
    }
}
