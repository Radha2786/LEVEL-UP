package Oops.Constructor;

public class Person {

    String name="Radhikaa";
    int age = 21;   // parsing hone k baad agr yha values hai to ye values initialse karega phle
    public void fun(){
        System.out.println("hey there");
    }
   public Person(){
        this.name="Motu";
        this.age=age;
    }
    public Person(String name,int age){
       this.name=name;
       this.age=age;
    }
}
