package LevelUpQuestions.Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans=TwoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] TwoSum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment = target-nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
