
public class IndexofanArray {

	
		       public static int  Index (int[] arr, int Num) {
		        if (arr == null) return -1;
		        int len = arr.length;
		        int i = 0;
		        while (i < len) {
		            if (arr[i] == Num) return i;
		            else i=i+1;
		        }
		        return -1;
		    }
		    public static void main(String[] args) {
		      int[] arr = {1, 5, 8, 11, 16, -1, 7, 25, 31};
		      System.out.println("Position of Index of -1 is: " + Index(arr, -1));
		      
		       }
		}

