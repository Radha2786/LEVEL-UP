package Practice;
import java.util.*;

public class Pallindrome_Partitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> ll = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        System.out.println( Palindrome_Partioning(s, ls,ll));

    }
    public static List<List<String>> Palindrome_Partioning(String str, List<String> ls, List<List<String>> ll){
        if(str.isEmpty()){
            ll.add(new ArrayList<>(ls));
        }

        for(int i=1;i<=str.length() ;i++){
            String p = str.substring(0,i);
            if(isPalindrome(p)){
                ls.add(p);
                Palindrome_Partioning(str.substring(i),ls,ll);
                ls.remove(ls.size()-1);
            }
          ;

        }
        return ll;

    }
    static boolean isPalindrome(String st){
        int s = 0;
        int e = st.length()-1;

        while (s < e){
            if(st.charAt(s) != st.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
