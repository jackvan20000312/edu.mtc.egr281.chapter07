package edu.mtc.egr281. chapter07;
import java.util.Scanner;
public class HorseRace {
public static void main(String[] args) {
	// PREPARE
	Scanner kb = new Scanner (System.in);
	Spinner spinner;
	Horse[] horses;
	// INPUT
	System.out.print("How many horses in the race: ");
	horses = new Horse[kb.nextInt()];
	for(int i = 0; i < horses.length; ++i) {
	System.out.print("Enter horse #" + (i + 1) + "'s name: ");
	horses[i] = new Horse(kb.next());
	}// Ending bracket of for loop
	System.out.print("What is the max value of the spinner? ");
	spinner = new Spinner(kb.nextInt());
	// PROCESS and QUTPUT
	boolean isRaceStillGoing = true;
	int index = -1;
	Horse h;
	do {
	++index;
	h = horses[index%horses. length];
	h.updateCurrentFurlong(spinner.spin());
	System.out.print(h.getName() +": ");
	printRaceTrack(h);
	if(h.getCurrentFurlong() >= 50) {
	isRaceStillGoing = false;
	}// Ending bracket of if
	} while(isRaceStillGoing);
	System.out.println(h.getName() + " is the winner!");
	// Close the input stream
	kb.close();
	}// Ending bracket of we main
	private static void printRaceTrack(Horse h) {
	for(int i = 0; i < 50; ++i) {
	if(i == h.getCurrentFurlong()) {
	System. out. print("*");
	} else {
	System.out.print("-");
	}// Ending bracket of if
	}// Ending bracket of for loop
	System.out.println();
	}// Ending bracket of method printRaceTrack
	}//Ending bracket of class HorseRace 
