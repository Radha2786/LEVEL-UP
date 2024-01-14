package Oops.ExceptionHandling;

public class Student_Client {
    public static void main(String[] args) throws Exception {

        Student s = new Student("radha", 20);

        s.setAge(-19);
        System.out.println(s.getAge());

    }
}
