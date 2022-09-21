import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

			   int[] arr = {2, 5, 6, 8, 10, 15, 17, 20};
			   int n=arr.length-1;
			   			   
			   int IP = 4;
			   int newValue  = 9;

			  System.out.println("Old Array values : "+Arrays.toString(arr));     
			   
			  for(int i=n; i > IP; i--){
			    arr[i] = arr[i-1];
			   }
			   arr[IP] = newValue;
			   System.out.println("New Array Values: "+Arrays.toString(arr));
			 }
			 
	}

