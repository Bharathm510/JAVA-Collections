import java.util.HashSet;
import java.util.Iterator;

public class IterateallHashsetele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set=new HashSet<String>();    
	        set.add("Red");    
	        set.add("Green");    
	        set.add("Black");    
	        set.add("White");
	        set.add("Pink");
	          
	        Iterator<String> itr=set.iterator();    
	        while(itr.hasNext()){    
	           System.out.println(itr.next());    
	        }    
	    }  
}