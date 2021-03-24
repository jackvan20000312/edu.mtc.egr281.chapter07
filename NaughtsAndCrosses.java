package edu.mtc.egr281.chapter07;
import java.util.Scanner;
public class NaughtsAndCrosses {
// Declarations
public static int row, col;
public static Scanner kb;
public static char[][] board;
public static char[] token;
public static int turn;
public static void main(String[] args) {
// Open input stream
kb = new Scanner (System.in);
setUpTheGame();
playTheGame();
// Close input stream
kb.close();
}// Ending bracket of method main
public static void setUpTheGame() {
turn = 0;
token = new char[]{'0', 'X'};
board = new char [3] [3];
for(int r = 0; r < board. length; ++r) {
for(int c = 0; c < board[r].length; ++c) {
board[r][c] = '_';
}// Ending bracket of INNER for loop
}// Ending bracket of OUTER for loop
}// Ending bracket of method setUpTheGame
public static void playTheGame() {
	do {
		++turn;
		System.out.println();
		System.out.println("Turn #" + turn + ":");
		printTheBoard();
		System.out.print(token[turn % token.length] + ", please enter a row: ");
		row = kb.nextInt() - 1;
		System.out.print(token[turn % token.length] + ", please enter a column: ");
		col = kb.nextInt() - 1;
		board[row] [col] = token[turn % token.length];
		} while(!isTheGameOver(row, col));
		System. out.println();
		System.out.print("Game over!! In turn #" + turn);
		System.out.println(", " + token[turn % token.length] + " wins!!");
}// Ending bracket of method playTheGame
public static boolean isTheGameOver(int rMove, int cMove) {
boolean rv = false;

// Check the possible winning combinations

// Horizontal, Vertical or Diagonals

if(board[0][cMove] == board[1][cMove] &&
board[1] [cMove] == board[2][cMove]) {
rv = true;
} else if(board[rMove] [0] == board[rMove] [1] &&
board[rMove] [1] == board[rMove][2]) {
rv = true;
} else if(board[0] [0] == board[1] [1] &&
board[1][1] == board[2] [2] &&
board[1][1] != '_') {
rv = true;
} else if(board[0] [2] == board[1][1] &&
board[1][1] == board[2] [0] &&
board[1][1] != '_'){
rv = true;
}// Ending bracket of if
return rv;
}// Ending bracket of method isTheGameOver
public static void printTheBoard() {
System.out.println();
System.out.println(" | 1 | 2 | 3 [");
System.out.println(" -------------");
for(int r = 0; r < board. length; ++r) {
for(int c = 0; c < board[r].length; ++c) {
if(c == 0) {
System.out.print((r+1) + ": | ");
}// Ending bracket of if
System.out.print(board[r][c] +" | ");
}// Ending bracket of INNER for loop
System.out.println();
}// Ending bracket of OUTER for loop
System. out. println();
}// Ending bracket of method printTheBoard
}// Ending bracket of class NaughtsAndCrosses