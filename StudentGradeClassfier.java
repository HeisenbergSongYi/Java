import java.util.Scanner;

public class StudentGradeClassfier{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Input your grade below");
		int Grade = input.nextInt();
		if (Grade < 60){
				System.out.println("WASTED");
		}else if (Grade <=70){
				System.out.println("Passing");
		}else if (Grade <=80){
				System.out.println("Meet requirement");
		}else if (Grade <=90){
				System.out.println("Good");
		}else if (Grade <100){
				System.out.println("Outstanding");
		}else if (Grade == 100){
				System.out.println("U cock sucker");
		}

}
}