package edu.mtc.egr281.chapter07;
public class RPSLSChoicesDriver {
public static void main(String[] args) {
RPSLSChoices p1;
RPSLSChoices p2;
int difference;
// Get choices from the players
p1 = RPSLSChoices.ROCK;
p2 = RPSLSChoices. PAPER;
difference = p1.ordinal() - p2.ordinal();
if(difference < 0) {
} difference += RPSLSChoices.values(). length;
System.out.println("P1 is " + p1.getName());
System.out.println("P2 is " + p2.getName());
if(difference == 0) {
System.out.println("It is tie.");
} else if(difference == 1 || difference == 3) {
System.out.println("Player 1 (" + p1.getName() + ") wins!");
} else if(difference == 2 || difference == 4) {
System.out.println("Player 2 (" + p2.getName() + ") wins!");
}// Ending bracket of if
System.out.println("End");
}// Ending bracket of method main
}// Ending bracket of class RPSLSChoicesDriver