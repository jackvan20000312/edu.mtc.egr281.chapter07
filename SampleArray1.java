package edu.mtc.egr281.chapter07;
import java.util.Scanner;
public class SampleArray1 {
	public static void main(String[] args) {

		// PREPARE
		Scanner kb = new Scanner(System.in);
		char[] myCharArray;

		// INPUT
		System.out.print("Enter number of chars to be stored: ");
		int initialSizeOfArray = kb.nextInt();
		myCharArray = new char[initialSizeOfArray];

		// PROCESS - Populate the array
		for(int i = 0; i < myCharArray. length; ++i) {
			System.out.print("Enter a char: ");
			myCharArray[i] = (kb.next()).charAt(0);
		}// Ending bracket of for loop

		// OUTPUT - using a regular for loop
		for(int i = 0; i < myCharArray. length; ++i) {
			myCharArray[i] = Character.toUpperCase(myCharArray[i]);
			System. out. print(Character.toLowerCase(myCharArray[i]));
		}// Ending bracket of for loop
		System.out.println();

		// or

		// OUTPUT - using a foreach loop
		for(char c : myCharArray) {
			System.out.print(c);
		}// Ending bracket of foreach loop

		// Close input stream
		kb.close();

	}// Ending bracket of method main

}// Ending bracket of class SampleArray1