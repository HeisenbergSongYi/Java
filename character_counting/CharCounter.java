// CharCounter.java
// Author: Luke
// Program last changed: 17 September 2019

public class CharCounter {

  // the attribute key is defined for you DO NOT EDIT THIS
  private final char key;
  private int count;

  public CharCounter(char key) {
    this.key = key;
    count=0;
  }

  public void observe(char observed) {
    if (observed == key){
      count ++;
    }
  }

  public int getCount() {
    return count;
  }
}

