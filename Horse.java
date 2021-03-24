package edu.mtc.egr281.chapter07;

public class Horse {
	private String name;
	private int currentFurlong;
	public Horse(String newName) {
		this. setName (newName) ;
		this.setCurrentFurlong(0);
	}// Ending bracket of constructor
	public String getName() {
		return this.name;
	}// Ending bracket of method getName
	private void setName(String newName) {
		this.name = newName;
	}// Ending bracket of method setName
	public int getCurrentFurlong() {
		return this. currentFurlong;
	}// Ending bracket of method getCurrentFurlong
	private void setCurrentFurlong(int newCurrentFurlong) {
		this.currentFurlong = newCurrentFurlong;
	}// Ending bracket of method setCurrentFurlong
	public void updateCurrentFurlong(int updateValue) {
		this.setCurrentFurlong(this.getCurrentFurlong() + updateValue) ;
	}// Ending bracket of method updateCurrentFurlong
}// Ending bracket of class Horse