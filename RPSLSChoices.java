package edu.mtc.egr281.chapter07;
public enum RPSLSChoices {
ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors"), SPOCK("Spock"), LIZARD("Lizard");
private String name;
 private RPSLSChoices(String newName) {
this.name = newName;
}// Ending bracket of constructor
public String getName() {
return this.name;
}// Ending bracket of method getName
}// Ending bracket of enum RPSLSChoices 