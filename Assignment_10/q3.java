package Assignment_10;

//Q.3. Use Interface instances to call the implemented method in the implemented class......

        interface Animal {       // our interface
            void Dog();
        }

        public class q3 implements Animal {          // the class that implements our interface
	         public void Dog(){
	         	System.out.println("Dog Barks.. This is call for for method from implemented class..");
	         }
        }





