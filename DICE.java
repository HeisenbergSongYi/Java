import java.util.Scanner;

public class DICE{
	public static void main(String[] args){
		Double RandomNumber= Math.random();
		int DiceNumber = (int)(RandomNumber*6+1);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess what the number is ?");
		int GuessNumber = input.nextInt();
		if ( DiceNumber > GuessNumber){
				System.out.println("The number should be bigger");
		}if ( DiceNumber < GuessNumber){
				System.out.println("The number should be smaller");
		}if ( DiceNumber == GuessNumber){
				System.out.println("The number matched your answer");
		}
		System.out.println(DiceNumber);
		System.out.println("Is the point of dice");
}
}