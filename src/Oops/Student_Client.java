package Oops;

// This keyword , class , object
public class Student_Client {
    public static void main(String[] args) {


        Student s= new Student();
        s.name="Harshi";
        s.age=21;
        s.Introduce_Yourself();
        Student s2 = new Student();
        s2.age=50;
        s2.Introduce_Yourself();
    }
}
