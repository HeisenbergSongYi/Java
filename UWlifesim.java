import java.util.Scanner;

public class UWlifesim{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of weekday in integer format");
		int day = input.nextInt();
		switch(day){
		case 1:
		System.out.println("SPCOM223");
		break;

		case 2:
		System.out.println("CS135");
		break;

		case 3:
		System.out.println("SPCOM223");
		break;

		case 4:
		System.out.println("CS135");
		break;

		case 5:
		System.out.println("EVERYTHING");
		break;

		case 6:
		System.out.println("Deadlines");
		break;
		
		case 7:
		System.out.println("Even more Deadlines");
		break;

		default:
		System.out.println("Error");	 

}
}	
}