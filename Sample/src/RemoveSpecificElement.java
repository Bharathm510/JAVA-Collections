import java.util.Arrays;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int[] arr = {10,15,20,25,30};
		
		System.out.println("Display the before removing element"+Arrays.toString(arr));
		
		//removing element 3
		
		int removeIndex= 2;
		
		for(int i=removeIndex; i< arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
	
	System.out.println("Display after removing the 2nd element of Index "+Arrays.toString(arr));
	}
	

}
