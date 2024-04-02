package String;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //195
        System.out.println("a"+"b"); // concatenating in this case
        System.out.println('a'+3); // 100
        System.out.println((char) ('a'+3)); // d
        System.out.println("a"+3);  // a3
        // this is same as  after a few steps: "a"+"1"
        // when an integer is added/concatenated with a string , it gets converted to its wrapper class (Integer)
//        that will call toString()

//        if there is an object it will call toString and gets converted or concatenated with string
    }
}
