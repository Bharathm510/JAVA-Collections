import java.util.Scanner;

public class Cal implements InF{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a,b,c =0;
		System.out.println("Enter A: ");
		a = getInput(sc);
		System.out.println("Enter B: ");
		b = getInput(sc); 
		System.out.println("1. A+B \t2. A-B \n3. A/B \t4. A*B");
		int operation = (int)getInput(sc);
		sc.close();
		
		switch (operation) {
		case 1:
			c=InF.plus(a, b);
			break;
		case 2:
			c=InF.minus(a, b);
			break;
		case 3:
			c=InF.div(a, b);
			break;
		case 4:
			c=InF.multi(a, b);
			break;	
		
		}
		System.out.println("Result:"+c);

	}

	static double getInput(Scanner sc) {
		return sc.nextDouble();
	}
}
