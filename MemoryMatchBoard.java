package edu.mtc.egr281. chapter07;
public class MemoryMatchBoard {
private char[][] board = {{'!', '@', '#', '$'},
						{'$','%', '&', '@'},
						{'+', '!', 'x', '&'},
						{'#', 'x','%', '+'}};
private boolean[][] matched = {{false, false, false, false},
							{false, false, false, false},
							{false, false, false, false},
							{false, false, false, false}};
private int guess1row, guess1column;
private int guess2row, guess2column;
private int numberOfMatches;

public MemoryMatchBoard() {
this.numberOfMatches = 0;
}// Ending bracket of constructor

public boolean hasMoreMatches() {
return this.numberOfMatches != 8;
}// Ending of method hasMoreMatches

public boolean isAMatch() {
boolean rv = false;
if(board[guess1row] [guess1column] == board[guess2row] [guess2column]) {
matched[guess1row] [guess1column] = true;
matched [guess2row] [guess2column] = true;
++this.numberOfMatches;
rv = true;
}// Ending bracket of if
return rv;
}// Ending bracket of method isAMatch

private void displayGuess(int row, int column) {
for(int r = 0; r < board. length; ++r) {
for(int c = 0; c < board[r].length; ++c) {
if (matched[r][c]) {
System.out.print(board[r] [c]);
} else if(r == row && c == column) {
System.out.print(board[r] [c]);
} else {
System.out.print("*");
}// Ending bracket of if
System.out.print(" ");
}// Ending bracket of INNER for loop
System.out.println();
}// Ending bracket of OUTER for loop
}// Ending bracket of method displayGuess

public void displayGuess1(int row, int column) {
this.guess1row = row;
this.guess1column = column;
displayGuess(row, column);
}// Ending bracket of method displayGuess1

public void displayGuess2(int row, int column) {
this.guess2row = row;
this.guess2column = column;
displayGuess(row, column);
}// Ending bracket of method displayGuess2

public void printBoard() {
for(int r = 0; r < board.length; ++r) {
for(int c = 0; c < board[r].length; ++c) {
System.out.print(board[r][c] + "_");
}// Ending bracket of INNER loop
System.out. println();
}// Ending bracket of for OUTER loop
}// Ending bracket of method printBoard
}