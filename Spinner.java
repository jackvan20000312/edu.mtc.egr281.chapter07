package edu.mtc.egr281.chapter07;
import java.util.Random;
public class Spinner {
private Random randomizer;
private int value;
private int maxNumber;
public static final int DEFAULT_MAX = 4;
public Spinner() {
this (Spinner. DEFAULT_MAX);
}// Ending bracket of default constructor
public Spinner(int newMaxNumber) {
this.setMaxNumber(newMaxNumber);
this.randomizer = new Random();
}// Ending bracket of constructor
public int getValue() {
return this.value;
}// Ending bracket of method getValue
private void setValue(int newValue) {
this.value = newValue;
}// Ending bracket of method setValue
private int getMaxNumber() {
return this.maxNumber;
}// Ending bracket of method getMaxNumber
private void setMaxNumber(int newMaxNumber) {
this.maxNumber = newMaxNumber;
}// Ending bracket of method setMaxNumber
public int spin() {
this.setValue(this. randomizer.nextInt(this.getMaxNumber()));
return this.getValue();
}// Ending bracket of method spin
}// Ending bracket of class Spinner