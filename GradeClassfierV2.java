import java.util.Scanner;

public class GradeClassfierV2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input the score in int format, range is 100-0");
		int score = input.nextInt();
		switch(score/10){
		case 0:
		
		case 1:
		
		case 2:
		
		case 3:
		
		case 4:
		
		case 5:
		
		case 6:
			System.out.println("Fail");
			break;
		case 7:
			System.out.println("Pass");
			break;
		case 8:
			System.out.println("Good");
			break;
		case 9:
			System.out.println("Excellent");
			break;
		case 10: 
			if(score==100){
			System.out.println("Go fuck yourself");
			break;
			}
		default:
			System.out.println("My ASS");
			break;
}
}
}