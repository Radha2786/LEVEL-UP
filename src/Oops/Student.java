package Oops;

public class Student {
    int age =21;
    String name= "Yash";

    public void Introduce_Yourself(){
        String name ="Harsh";
//        System.out.println("hey there I am " +name +" and this is my age "+ age); // here we are getting Harsh everytime hence in order to get class variable
//        we will use this keyword to access the class's data member
        System.out.println("hey there I am " +this.name +" and this is my age "+ this.age);

    }
}
