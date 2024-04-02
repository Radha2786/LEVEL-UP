package String;

public class Basics01 {
    public static void main(String[] args) {
        // this will create only 1 object inside string pool and hence both variable will point to same location and will give true
        String a = "Radha";
        String b = "Radha";
        System.out.println(a==b);

        // this will create different objects outside string pool that's why will give false
        String name1 = new String("Radha");
        String name2 = new String("Radha");
        System.out.println(name1==name2);

        // .equals
        // only checks values
        System.out.println(name1.equals(name2));
    }
}
