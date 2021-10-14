/*
 * CharCharCounterProg.java
 * Author: Luke Dickens
 * Program last changed: 17 September 2019
 */


import java.util.Scanner;
import java.util.Random;

public class CharCounterProg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // you must create two objects as described in the tutorial sheet.
        CharCounter dotCounter = new CharCounter('.');
        CharCounter starCounter = new CharCounter('*');

        while (true) {
            // elicit guess and create animal
            System.out.print("Input a line of characters: ");
            String userInput = scanner.next();
            for (int i = 0; i < userInput.length() ; i++) {
                char currentChar = userInput.charAt(i);
                // you must call the observe function on each of your objects
                dotCounter.observe(currentChar);
                starCounter.observe(currentChar);
            }
            System.out.println("So far I have observed:");
            System.out.println(dotCounter.getCount()+"dots");
            System.out.println(starCounter.getCount()+"stars");
            // you must output to screen the counts of your two counters
        }
    }
}

