// Author: Rob Miller
// Program last changed: 26 September 2008

/* This program tests the DecimalNumber class enhanced with a copy constructor.   */ 

public class DecimalNumberTester
{
    public static void main(String[] args)
    {
        DecimalNumber num1 = new DecimalNumber(10); //constructor 2
        DecimalNumber num2 = new DecimalNumber(20.0d); //constructor 2
        DecimalNumber num3 = new DecimalNumber(num2);//constructor 3
        System.out.println("The value of num1 starts as " + num1 + ".");
        System.out.println("The value of num2 starts as " + num2 + ".");
        System.out.println("The value of num3 starts as " + num3 + ".");
        System.out.println();

        num1 = num2;
        num2.setValue(30);
        System.out.println("The value of num1 ends up as " + num1 + ".");
        System.out.println("The value of num2 ends up as " + num2 + ".");
        System.out.println("The value of num3 ends up as " + num3 + ".");

        //num2.value = 45;
        //at line 18, num2 and num1 points at the same address in heap, 
        //num2's corresponding heap address get changed to 30 at line 20
        //so num 1 = num2 = 30. while num3 points to num2 's previous heap address

        //num3 will equal to 45,error reads value has private access in DecimalNumber
    }
}

/* 

   ADD A COMMENT HERE TO EXPLAIN WHY THIS PROGRAM PRODUCES ITS OUTPUT

*/
