package Recursion.Subsequence;

public class Subsequence_of_string {
    public static void main(String[] args) {
        String str = "ahbgdc";
        int count=0;
        int ans=Print_subsequence(str, " ",count);
        System.out.println(ans);
    }

    public static int Print_subsequence(String question, String ans,int count){
        // base case
        if(question.length()==0){
            System.out.println(ans);
            return 1;
        }
        // not choose call
        int left=Print_subsequence(question.substring(1),ans,count);
        // choose call
       int right= Print_subsequence(question.substring(1),ans+ question.charAt(0),count);
        return left + right;
    }
}
