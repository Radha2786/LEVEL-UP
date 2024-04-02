package Recursion;

import java.util.ArrayList;
import java.util.*;

public class main {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(result, s, 0, new ArrayList<>());
        return result;
    }

    private static void backtrack(List<String> result, String s, int start, List<String> current) {
        if (start == s.length() && current.size() == 4) {
            result.add(String.join(".", current));
            return;
        }

        if (current.size() >= 4) {
            return;
        }

        for (int i = start; i < s.length() && i < start + 3; i++) {
            String segment = s.substring(start, i + 1);
            if (isValidSegment(segment)) {
                current.add(segment);
                backtrack(result, s, i + 1, current);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.length() == 0 || segment.length() > 3) {
            return false;
        }
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
         String s = "25525511135";
        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
        List<String> result = restoreIpAddresses(s);
        // System.out.println("Possible IP addresses from the given string:");
        System.out.print(result.size()+" ");
        for (String ip : result) {
            System.out.print(ip+" ");
        }
    }
}
