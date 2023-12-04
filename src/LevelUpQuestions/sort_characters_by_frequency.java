package LevelUpQuestions;
import java.util.*;


public class sort_characters_by_frequency {

    public static void main(String[] args) {
       String str = "tree";
        System.out.println( frequencySort(str));

    }

    public static String frequencySort(String str) {

        class Pair {
            int count;
            char ch;

            Pair(char ch, int count) {
                this.count = count;
                this.ch = ch;
            }
        }
        int[] arr = new int[123];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        System.out.println(Arrays.toString(arr));

        LinkedList<Pair> frequency_list = new LinkedList<>();
        for(int j=0 ; j<arr.length; j++){
            if(arr[j]>0){
                frequency_list.add(new Pair((char)j,arr[j]));
            }
        }
        Collections.sort(frequency_list,new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return b.count - a.count ;
            }
        });
        StringBuilder sb = new StringBuilder();


        for(Pair p: frequency_list){
            int c = p.count;
            while(c-->0){
                sb.append(p.ch);
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

}
