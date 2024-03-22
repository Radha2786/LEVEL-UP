package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;

public class Binary_String {
    public static void main(String[] args) {
        int N = 4;
        List<String> list = new ArrayList<>();
        Print_String(N, list, "");
        System.out.println(list);
    }
    public static void  Print_String(int Target, List<String> list, String ans){
        if(Target==0){
            list.add(ans);
            return ;
        }
        // call for 0
        Print_String(Target-1,list,ans+" "+0);
        // call for 1
        if(ans.length()==0 || ans.charAt(ans.length()-1)!= '1'){
            Print_String(Target-1,list,ans+" "+1);
        }


    }
}

//0000 0001 0010 0100 0101 1000 1001 1010
