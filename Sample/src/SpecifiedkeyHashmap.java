import java.util.HashMap;
import java.util.Map.Entry;

public class SpecifiedkeyHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();  
		  map.put(1, "Red");
		  map.put(2, "Green");
		  map.put(3, "Black");
		  map.put(4, "White");
		  map.put(5, "Blue");
		  for(Entry<Integer, String> x:map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
		 }  

	}

