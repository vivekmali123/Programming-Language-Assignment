package Assignment_14;

                          //14. Exceptions

// Q.1. Write a program to generate Arithmetic Exception without exception handling

    public class Main {

        void divide(int a, int b) {
            // performing division
            int res = a / b;
            System.out.println("Division process has been done successfully.");
            System.out.println("Result came after division is: " + res);
        }

        public static void main(String args[]) {
            Main obj = new Main();
            obj.divide(1, 0);   // it will throw exception....


        }
    }