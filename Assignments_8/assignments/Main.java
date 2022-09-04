package Assignments_8.assignments;

import java.lang.reflect.Field;

                                   //8. Access Modifiers


public class Main {

    private String privateString = null;        // private fields
    public Main(String privateString) {
        this.privateString = privateString;
    }
    private void method(){            // private method
        System.out.println("Hii are u vivek ? ");
    }

    public static void main(String[] args) {     // main method

    // For Question 1..... call in main method, And try to access private fields and methods from subclass.


        Main privateObject = new Main("The Private Value");   // object

        Field privateStringField = Main.class.              // call for private field
                getDeclaredField("privateString");

        privateStringField.setAccessible(true);

        String fieldValue = (String) privateStringField.get(privateObject);
        System.out.println("fieldValue = " + fieldValue);

        privateObject.method();           // call for private method


        // we can't access private method and private field from subclass,,, it throws exception...
        //privateField has private access in com.intershala.javaapp.q1


            q1 testObject = new q1();
            assertEquals(123, testObject.privateField);
            assertEquals(456, testObject.privateMethod());



    // For Question 2..  Access from other class within same package..


        q2 obj = new q2();
        obj.field = "This is default field";
        System.out.println("\nAnswer for 2nd question");
        System.out.println(obj.field);
        obj.method1();


    // For Question 3..  Access from other class within same package..


        q3 obj2 = new q3();
        obj2.proctfield = "This is protected field";
        System.out.println("\nAnswer for 3rd question");
        System.out.println(obj2.proctfield);
        obj2.proctmethod();


    }
}
