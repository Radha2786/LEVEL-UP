package LevelUpQuestions;
import java.util.*;

public class Rotate_String {
    public static void main(String[] args) {
      String  s = "abcde", goal = "cdeab" ;
        char[] ch = s.toCharArray();
        char[] ch2 = s.toCharArray();
        for(int i=0;i<s.length();i++){
            ch[i]= s.charAt(i);
        }
        for(int i=0;i<goal.length();i++){
            ch2[i]= goal.charAt(i);
        }
        int index=0;
        int n = s.length();
        for(int i=0;i<goal.length() ; i++){
            for(int j=0;j<s.length() ; j++){
                if(ch[i]==ch2[j]){
                    index = j;
                }

            }
        }
        // for(int i=index ;i<s.length();i++){
        int ind =index;
        for(int j=0;j<goal.length();j++){
            if(ch[ind % n]!=ch2[j]){
                System.out.println("false");
                return;
            }
        }
//        return true;
        System.out.println("true");
        // }
    }
}


//-------------------------------------------------






class Solution {
    public boolean rotateString(String s, String goal) {
        char[] ch = s.toCharArray();
        char[] ch2 = s.toCharArray();
        for(int i=0;i<s.length();i++){
            ch[i]= s.charAt(i);
        }
        for(int i=0;i<goal.length();i++){
            ch2[i]= goal.charAt(i);
        }
        int index=0;
        int n = s.length();
        for(int i=0;i<goal.length() ; i++){
            for(int j=0;j<s.length() ; j++){
                if(ch[i]==ch2[j]){
                    index = j;
                }

            }
        }
        // for(int i=index ;i<s.length();i++){
        int ind =index;
        for(int j=0;j<goal.length();j++){
            if(ch[ind % n]!=ch2[j]){
                return false;
            }
        }
        return true;
        // }
    }
}
