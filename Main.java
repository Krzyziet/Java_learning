package com.Krzysztof;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInts = getIntegers(5); // making array for ints
        printIntegers(myInts);
        sortIntegers(myInts);
        System.out.println();
        printIntegers(myInts);
    }

    public static int[] getIntegers(int capacity){ //scanning integers
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values.");
        for(int i = 0 ; i < array.length ; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printIntegers(int[] array) //printing array
    {
        for(int i = 0; i < array.length ; i++){
            System.out.print(" " + array[i] + " ");
        }
    }

    public static int[] sortIntegers(int[] array){
        boolean sorted = false; //while stopper
        int i = 0;
        int bufor;
        int changes = 0;
        while(sorted == false){
            if (i < array.length-1){ // if loop statemant
                if(array[i]<array[i+1]){ //change statement
                    System.out.println("Changing " + array[i] + " with " + array[i+1]);
                    changes++; //adding one change
                    bufor=array[i];
                    array[i]=array[i+1];
                    array[i+1] = bufor;
                    i++;
                }
                else{
                    i++;
                }
            }
            else{
                i=0;
                if(changes == 0){
                    sorted=true;
                }
                else{
                    changes=0;
                }
            }

        }
        return array;
    }
}
