/*
 * Author: Luke Dickens
 * Program last changed: 26 September 2019
 */


public class ComparingDecimalNumbers {
    public static void main(String[] args){
        DecimalNumber num1 = new DecimalNumber();
        DecimalNumber num2 = new DecimalNumber();
        DecimalNumber num3 = new DecimalNumber();
        num1.setValue(1.1); //a float literal,passed as arguments for methods
        num2.setValue(2.2d); //a double literal,passed as arguments for methods
        num3.setValue(3); //int literal,passed as arguments for methods
        System.out.println("The value of num1 is " + num1 + ".");//a String literal,used as arguments in operations
        System.out.println("The value of num2 is " + num2 + ".");
        System.out.println("The value of num3 is " + num3 + ".");
        System.out.println();

        // block A
        if (num1.lessThan(num2)) {
            System.out.println("num1 is less-than num2");
        } else {
            System.out.println("num1 is not less-than num2");
        }
        if (num2.lessThan(num2)) {
            System.out.println("num2 is less-than num2");
        } else {
            System.out.println("num2 is not less-than num2");
        }
        if (num3.lessThan(num2)) {
            System.out.println("num3 is less-than num2");
        } else {
            System.out.println("num3 is not less-than num2");
        }
        System.out.println();

        // question c, it does not, lessThan method does not exist

        // block B
        
        double aValue = 1.5;
        if (num1.lessThan(aValue)) {
            System.out.println("num1 is less-than num2");
        } else {
            System.out.println("num1 is not less-than num2");
        }
        if (num2.lessThan(aValue)) {
            System.out.println("num2 is less-than num2");
        } else {
            System.out.println("num2 is not less-than num2");
        }
        if (num3.lessThan(aValue)) {
            System.out.println("num3 is less-than num2");
        } else {
            System.out.println("num3 is not less-than num2");
        }
        System.out.println();
        
        //f) does not compile, since aValue is double, num1 is object

        // block C
        
        if (num1.value < num2.value ) {
            System.out.println("num1 is less-than num2");
        } else {
            System.out.println("num1 is not less-than num2");
        }

        //h)cant use < to compare two objects, yes I can change it
         
    }
}

