/*
 * Drink.java
 * Author: Luke Dickens
 * Program last changed: 19 September 2019
 */

public class Drink {

  // you MUST add some attributes to this class
  private String flavour;
  private double level; 
  // You MUST add a constructor, look at the slides for examples
  public Drink(String flavour) {
    this.flavour=flavour;
    level = 0;
  }
  // You MUST add one or more methods, look at the slides (in particular the one
  // entitled "Anatomy of a Method") for guidance on how to declare one.
  public void fill(){
    level = 1;
  }

  public void consume(double amount){
    if (amount<level & 0<amount){
      level = level-amount;
    }else if (level<amount){
      level=0;
    }else{
    }
  }
  // 0<amount<level level=level-amount
  // level<amount level=0

  public String toString() {
      return "Drink(flavour:" + flavour + ", " + level + ")";
  }

}

