package edu.mtc.egr281.chapter07;
import java.util.Scanner;
public class SampleArray2 {
public static void main(String[] args) {

// PREPARE
Scanner keyboard = new Scanner(System.in);
int[] myIntArray = new int[0];
for(int i = 0; i < myIntArray. length; ++i) {
myIntArray[i] = i;
}// Ending bracket of for loop

// INPUT
System.out.print("Enter a multiplier: ");
int m = keyboard.nextInt();

// PROCESS
for(int i = 0; i < myIntArray. length; ++i) {
myIntArray[i] *= m;
}// Ending bracket of for loop

// OUTPUT
for(int i : myIntArray) {
System.out. println(i);
}// Ending bracket of for loop

// Close input stream
keyboard. close();

}// Ending bracket of method main

}// Ending bracket of class SampleArray2