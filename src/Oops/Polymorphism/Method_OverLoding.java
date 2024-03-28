package Oops.Polymorphism;

// compile time polymorphism

public class Method_OverLoding {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4,5));
    }
    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static int add(int a , int b, double c){
        return (int) (a+b+c);
    }
    public static int add(int b , int c, int... a){
        System.out.println(b);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum;
    }
}

// method overloading -- within same class

//function name should be same, return type should be same only number of arguments vary
