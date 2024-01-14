package Oops.ExceptionHandling;

public class Student {

    String name;
    int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age) throws Exception {
        try {


            this.age = age;
            if (age < 0) {
                throw new Exception("age can't be -ve chaman");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(getName());
        }
    }
}
