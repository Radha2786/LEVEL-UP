package LevelUpQuestions;
import java.util.*;

public class Largest_odd_number {
    public static void main(String[] args) {
       String num = "52";
       int n = num.length()-1;
       for (int i=n;i>=0;i--){
           int j = num.charAt(i)-48;
           if(j%2!=0){
               System.out.println(num.substring(0,i));
               return;
           }
       }
        System.out.println("");
    }
}
