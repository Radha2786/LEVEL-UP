package Oops.Constructor;

public class Person {

    private String name="Radhikaa";
   private int age = 21;   // parsing hone k baad agr yha values hai to ye values initialse karega phle

//    int age = -20 suppose if we have given the age negative which should not be hence we have to make this private so that anyone outside
//     of the class can not access it
    public void fun(){
        System.out.println("hey " +name+ " age "+age );
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    // constructor

   public Person(){
        this.name="Motu";
        this.age=age;
    }

    // parametrized constructor
    public Person(String name,int age){
       this.name=name;
       this.age=age;
    }
}
