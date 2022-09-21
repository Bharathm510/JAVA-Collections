
public class MinMax {
	
	 public int max(int [] arr) {
	      int max = 0;
	      int n=arr.length;
	     
	      for(int i=0; i<n; i++ ) {
	         if(arr[i]>max) {
	            max = arr[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] arr) {
	      int min = arr[0];
	     
	      for(int i=0; i<arr.length; i++ ) {
	         if(arr[i]<min) {
	            min = arr[i];
	         }
	      }
	      return min;
	   }
	   public static void main(String args[]) {
	      int[] myArr = {7, 10, 25, 36, 75};
	      MinMax m = new MinMax();
	      System.out.println("Maximum value in the array is:"+m.max(myArr));
	      System.out.println("Minimum value in the array is:"+m.min(myArr));
	   }
	}


