package LevelUpQuestions.Leetcode;

public class Remove_duplicate_from_sorted_array_2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int e: nums){
            if(i==0 || i==1 || nums[i-2]!=e ){
                nums[i]=e;
                i++;
            }
            // otherwise keep i constant and check until nums[i-2]!=e
        }
        return i;

    }

}

