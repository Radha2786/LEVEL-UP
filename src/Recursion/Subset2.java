package Recursion;
import java.util.*;
public class Subset2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        Subsets(0,nums,list,ll);
//        return ll;
        System.out.println(ll);
    }
    static void Subsets(int index,int[] nums,List<Integer> list,List<List<Integer>> ll){
        ll.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            Subsets(i+1,nums,list,ll);
            list.remove(list.size()-1);
        }

    }

}
