package LevelUpQuestions;
// Leetcode potd

import java.util.HashSet;

public class Path_Crossing {
    public static void main(String[] args) {
        String path = "NESWW";
        HashSet<String> set = new HashSet<>();
        set.add(0+","+0);
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch=='N') {
                y++;
            }else if(ch=='S') {
                y--;
            }else if(ch=='E') {
                x++;
            }else {
                x--;
            }
            String coo = x+","+y;
            if(set.contains(coo)) {
                System.out.println("true");
                return ;
            }
            set.add(coo);
        }
        System.out.println("false");

//        return false;
    }
}

