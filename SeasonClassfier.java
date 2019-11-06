import java.util.Scanner;

public class SeasonClassfier{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.println("Input the month in number format below");
		int Month = input.nextInt();
		
		if (Month  <= 5 && Month  >= 3) {
				System.out.println("Spring");
		}else if (Month  <= 8 && Month  >= 6){
				System.out.println("Summer");
		}else if (Month  <= 11 && Month  >= 9){
				System.out.println("Fall");
		}else if (Month  == 12 || Month == 1 || Month == 2){
				System.out.println("Winter");
		}else{
				System.out.println("Error");
		}

}
}