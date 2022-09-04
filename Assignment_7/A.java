package com.intershala.Assignment_7;

public class A extends Main{    //Super Class A....

    /* Create three methods in each class, 2 methods are specific to each class and third
       method (override method) should be in all three Classes A, B and C  */


    public static void methodA1(){
        System.out.println("\nFirst method of class A.");
    }
    public static void methodA2(){
        System.out.println("second method of class A.");
    }
    public static void method(String sA){        // overridden method...

        System.out.println("\nOverridden method.." + sA);

    }

}
