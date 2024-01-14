package Oops.Constructor;

public class Person_Client {
    public static void main(String[] args) {
        Person p = new Person("Hrithik", 22);
        p.name="Kaju";
        p.age=21;
        p.fun();
        Person p1 = new Person("Pathak",23);
        p1.name="Radha";
        p1.age=20;
        p1.fun();
    }

    // 1st step = memory allocation
    // 2nd step = Parsing
    // 3rd step = Contructor calling
}
