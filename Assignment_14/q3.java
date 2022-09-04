package Assignment_14;

// Q.3. Write a method which throws exception, Call that method in main class without try block

public class q3 {

	    int x;
		public void setCapacity(int x) throws NullPointerException{

			if (x<0){
				throw new NullPointerException();
			}else{
				this.x = x;
			}

		}


	public static void main(String args[]){

      q3 obj = new q3();
      obj.setCapacity(-1);  // it will throw exception

	}



}
