package com.intershala.javaapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
                                                 //4. Arrays

public class Main {

//Q1. Write a function to add integer values of an array.......

    public static void method(){

        System.out.println("\n*** Answer for 1st question....\n");
        int[] arr = {0,1,2,3,4,5};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int x: arr) {
            al.add(x);
        }
        al.add(6);                    //function to add more elements to the array list
        al.add(7);
        System.out.println("Array after adding integer: " + al);


//Q.2. Write a function to calculate the average value of an array of integers.....

        int arr1[]={10,20,30};
        int sum=0;
        for(int i=0; i<arr1.length; i++){
            sum += arr1[i];
        }
        System.out.println("\n*** Answer for 2nd question....\n");
        System.out.println("Sum of array: " + sum);
        int average=sum/ arr1.length;
        System.out.println("Average value of array: " + average);


//Q.3. Write a program to find the index of an array element.......

        int[] numbers = {4, 9, 7, 3, 2, 8};
        int element = 2;
        int index = -1;

        System.out.println("\n*** Answer for 3rd question....\n");
        int i = 0;
        while(i < numbers.length) {
            if(numbers[i] == element) {
                index = i;
                break;
            }
            i++;
        }
        System.out.println("Index of element "+element+" is : "+index);


//Q.4. Write a function to test if array contains a specific value

        int[] num = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;

        System.out.println("\n*** Answer for 4th question....\n");
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if(found) {            // If array contains specific value.....
            System.out.println(toFind + "(specific value) is found. So array contains specific value");
        }else {
            System.out.println(toFind + "(specific value) is not found.");
        }


//Q.5. Write a function to remove a specific element from an array.......

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("\n*** Answer for 5th question....\n");

        ArrayList<Integer> ar = new ArrayList<Integer>();          //create a arraylist......
        for(int x: my_array) {
            ar.add(x);
        }
        System.out.println("Original Array : "+ ar);

        int removeIndex = 1;

        for(int p = removeIndex; p < my_array.length -1; p++){
            my_array[p] = my_array[p + 1];
        }

        ArrayList<Integer> arl = new ArrayList<Integer>();      //create new updated arraylist....
        for(int y: my_array){
            arl.add(y);
        }
        System.out.println("After removing the second element: "+ arl);


//Q.6. Write a function to copy an array to another array........

        int [] array1 = new int [] {1, 2, 3, 4, 5};       // First array.....
        int array2[] = new int[array1.length];           //Second Array......

        System.out.println("\n*** Answer for 6th question....\n" +
                "");
        for (int z = 0; z < array1.length; z++) {
            array2[z] = array1[z];                        //copying elements in second array.....
        }

        System.out.println("Elements of original array: ");
        for (int l = 0; l < array1.length; l++) {             //Displaying elements of first array....
            System.out.print(array1[l] + " ");
        }

        System.out.println();

        System.out.println("Elements of new array after copying: ");
        for (int z = 0; z < array2.length; z++) {           //Displaying elements of second array.......
            System.out.print(array2[z] + " ");
        }
    }

    public static void main(String[] args) {
           Main a=new Main();
           a.method();
    }
}
