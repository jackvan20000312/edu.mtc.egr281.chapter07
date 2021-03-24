package edu.mtc.egr281. chapter07;

import java.util.Scanner;

public class MemoryMatchGame {

public static void main(String[] args) {
MemoryMatchBoard mmb = new MemoryMatchBoard();
mmb.printBoard();
Scanner keyboard = new Scanner(System.in);
int row, column;
do {
System.out.print("Enter first guess row [0 - 3]: ");
row = keyboard. nextInt();
System.out.print("Enter first guess column [0 - 3]: ");
column = keyboard.nextInt();
mmb.displayGuess1(row, column);
System.out.print("Enter second guess row [0 - 3]: ");
row = keyboard.nextInt();
System.out.print("Enter second guess column [0 - 3]: ");
column = keyboard.nextInt();
mmb.displayGuess2(row, column);
if(mmb.isAMatch()) {
System. out.println();
System.out.println("Hurray! It's a match!!");
System. out. println();
}// Ending bracket of if
} while(mmb. hasMoreMatches());
System.out.println("GAME OVER!");
//Close input strean
keyboard.close();

}// Ending bracket of method main
}// Ending bracket of class MemoryMatchGame