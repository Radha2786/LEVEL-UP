package POTD;
import java.util.*;

public class Unique_Occurances1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(Integer value : map.values()){
            if (set.add(value)==false) {
                return false; // Duplicate value found
            }
        }
        return true;




    }
}

