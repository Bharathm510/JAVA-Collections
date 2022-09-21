import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		try {
			
		
		System.out.println("enter first num");
		int n1 = input.nextInt();
		System.out.println("ENter second num");
		int n2 = input.nextInt();
		int sum = n1/n2;
		System.out.println(sum);

	}
	catch(Exception e) {
		System.out.println("obtain Exception Handling");
	}
		
	}

}
