package Oops.Inheritance.Cb;

public class Client {
    public static void main(String[] args) {
        //------- Case 1
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);

        //----- case 2
//        P obj = new C();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(((C) obj).d2);
//        System.out.println(((C)obj).d);

        // jab code likhte hai to pura ka pura control compiler k paas hota hai, compiler left hand side dekhta hai,
        // hence obj abhi P type ka hoga but run tym m C ka bhi access kar skte hain

//        obj.fun();
//        obj.fun1();
//        ((C) obj).fun2();


        // Method Overriding = jab same name ka function child and parent class dono m ho (everything is same just internal logic is different)

        //-------- case 3  (this will give compile time error, this case is not allowed in java)
//        C obj = new P();   // sirf p ke data members ko space mila hoga not c ke ko to error aayega
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(obj.d2);
//        obj.fun();

    }
}
