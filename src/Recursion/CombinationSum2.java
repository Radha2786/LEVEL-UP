package Recursion;
import  java.util.*;
public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        CombinationSum2(candidates,target,0,list,ll);
//        return ll;
        System.out.println(ll);
    }
    public static void CombinationSum2(int[] candidates , int target, int index ,List<Integer> list,List<List<Integer>> ll){
        if(target<0){
            return;
        }
        if(target==0){
            ll.add(new ArrayList<>(list));
            return;
        }

        for(int i=index ; i<candidates.length;i++){

            if(index==i || candidates[i]!=candidates[i-1]){
                list.add(candidates[i]);
                CombinationSum2(candidates,target-candidates[i],i+1,list,ll);
                list.remove(list.size()-1);
            }

        }
    }
}
