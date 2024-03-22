package Recursion.Subsequence;

public class Board_Path {
    public static void main(String[] args) {
        int Target = 4;
        int c=Path(Target,"");
        System.out.println(c);
    }
    public static int Path(int Target,String ans){
        if(Target==0){
            System.out.println(ans);
            return 1;
        }
        int count=0;
        for(int i=1;i<=3;i++){
            if(i<=Target){
                count= count+Path(Target-i,ans+" "+i);
            }

        }
        return count;
    }
}
