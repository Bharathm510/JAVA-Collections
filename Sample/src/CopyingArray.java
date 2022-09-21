import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		
			   int[] arr = {2, 1, 6, 8, 10, 12, 7};
			   int[] arr1 = new int[7];     
			 
			   System.out.println("Old Array values : "+Arrays.toString(arr));     
			   
			  for(int i=0; i < arr.length; i++) {
			    
				  arr1[i] = arr[i];
			  
			   System.out.println("Updated Array values : "+Arrays.toString(arr1));
			 }
	
	}
}
			 

	


