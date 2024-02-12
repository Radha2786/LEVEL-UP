package Dp;

public class Partition_String_Into_Minimum_Beautiful_Substrings {
    public static void main(String[] args) {
        String s = "1011";
        int n = s.length();
        int min=minCuts(s,n,0) ;
        if(min==0){
            System.out.println( -1);
        }else{
            System.out.println( min);
        }
    }
    public static int minCuts(String s, int n, int index){
        if(index==n){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        if(s.charAt(index)!='0'){
            for(int j=index;j<n;j++){
                String str = s.substring(index,j+1);
                if(isPowerOf5 (Long.parseLong(str,2))){
                    int cur= minCuts(s,n,j+1);
                    if (cur != -1) {
                        min = Math.min(min, cur + 1);
                    }
//                    min= Math.min(cur,min);
                }
            }

        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    public static boolean isPowerOf5(Long num) {
        while (num != 1) {
            if (num % 5 != 0) {
                return false;
            }
            num /= 5;
        }
        return true;
    }
}
