package com.intershala.javaapp;

public class question19 {

//Q.19. Write a function to find the missing number of sorted array of 1 to 100....

	static int ar[]={3,5,8,44};             //given array  3,5,8,44
	public static void main(String[] args){
		displayMissing();
	}

	static public void displayMissing(){

		System.out.println("Answer for 19th question......");
		System.out.print("\ngiven array(already sorted): ");
		int j=0;
		for(int i=1;i<=100;i++){
			if(j<ar.length && i==ar[j]) {
				j++;
			}else {
				System.out.print(i + " ");
			}
		}

		System.out.print("\nNumbers missing between 1 to 100 in array:  ");
		for(int z = 0; z < ar.length; z++){
			System.out.print(ar[z] + " ");       // display it
		}
	}
}
