import java.util.ArrayList;
import java.util.List;

public class InsertArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> Stringslist = new ArrayList<String>();
		  Stringslist.add("Red");
		  Stringslist.add("Green");    
		  Stringslist.add("Orange");
		  Stringslist.add("White");
		  Stringslist.add("Black");
		  		 
		  System.out.println(Stringslist);
		 
		  Stringslist.add(0, "Pink");
		  Stringslist.add(3, "Yellow");
		 
		  System.out.println(Stringslist);
		 }
		}
	
