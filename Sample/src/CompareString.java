
public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "BHARATH";
		String s2 = "bharath";
	    int result = s1.compareToIgnoreCase(s2);
		
		if(result == 0) 
		
		{
			
			System.out.println("Comparing both the strings");
			System.out.println(  s1 + "is equal to"+  s2);
			
			
		} else {
			
			System.out.println("Both string values are different");
		}

	}

}
