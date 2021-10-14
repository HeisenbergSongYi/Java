/*
 * A simple class for wrapping primitive double as objects author
 * Luke Dickens based on previous material by Martin O'Reilly and Rob Miller.
 * 19 September 2019
*/

public class DecimalNumber {

    public double value;

    public DecimalNumber() {
        this.value = 0.0;
    } 
    public DecimalNumber(int value) {
        this.value =(double)(value);
    } 

    public DecimalNumber(double value){
        this.value = (double)value;
    }

    public DecimalNumber(DecimalNumber num3){
        this.value = num3.value;
    }

    // a) 2 constructors, first consructor assign zero to variable value, 
    //  2nd one assign whatever integer that main method gives it

    // You MUST add one or more constructors to this method
    
    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    //setter method, setValue change value of an existing object's variable 

    public String toString() {
        return String.valueOf(this.getValue());
    }

    public boolean lessThan(DecimalNumber obj){
        return this.value < obj.value;
    }

    public boolean lessThan(double db){
        return this.value < db;
    }

}
