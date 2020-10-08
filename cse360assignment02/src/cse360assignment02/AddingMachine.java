package cse360assignment02;

/**
 * @author Jeffery Erskine CSE 360 Assignment 2
 * This program adds the values from the main to 
 * print the to string "0 + 4 – 2 + 5"
 * myCalculator.add (4); 
 * myCalculator.subtract (2); 
 * myCalculator.add(5);
 */

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /**
   * getTotal method will return the value of total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * add method adds the value to the total
   * and formats the history for the toString
   */
  public void add (int value) {
	  total = total + value;
	  history = history + " + " + value;
  }

  /**
   * subtract method subtracts the value from the total
   * and formats the history for the toString
   */
  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + value;
  }

  /**
   * The toString will be called by the main
   * to print the results. 
   */
  public String toString () {
    return history;
  }

  /**
   * the clear method sets values back to 0
   */
  public void clear() {
	  total = 0;
	  history = "";
  }
 
}