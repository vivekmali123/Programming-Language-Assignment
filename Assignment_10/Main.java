package Assignment_10;

                                 //10. Interfaces
public class Main {

    public static void main(String[] args) {

        // For question 1..... Call for implemented method
        q1 r1 = new q1();
        r1.getArea(5, 6);


        // For question 2..... Call for only one method out of 2
        Drawable d=new q2();
        d.draw();


        // For question 3..... Call for implemented method in the implemented class
        q3 obj = new q3();
        System.out.println("\nAnswer for 3rd question.....");

        if (obj instanceof Animal){
            System.out.println("obj is an instance of Animal interface");
        }
        obj.Dog();


        // For question 4..... Implement these two interfaces in one class.
        q4 obj1= new q4();
        obj1.method1();
        obj1.method2();

        // For question 5..... Call for method.
        q5 obj2 = new q5();
        obj2.samemethod();

        // For question 6..... calling with providing implementation.
        q6 obj3 = new q6();
        obj3.function();

        // For question 7..... interface inherited from the other interface.
        q7 n = new q7();
        n.intfA();
        n.intfB();

        // For question 8..... print value of public interface method.
        q8 q = new q8();
        q.newmethod(20);

        // For question 9..... print value of private interface.
        //q9 se = new q9();
        //se.see();

        // For question 10.... Calling private, protected, public fields.
        field s = new q10();
        s.function1("Vivek");

        // For question 11.... Static final variable call.
        //intfacenew newobj = new q11();
        //newobj.varmethod();


    }
}

