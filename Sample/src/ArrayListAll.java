import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Red");
		ar1.add("Orange");
		ar1.add("White");
		ar1.add("Green");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Blue");
		ar2.add("Yellow");
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		ar1.addAll(2, ar2);
		System.out.println(ar1);
		
		ar1.clear();
		System.out.println(ar1);
		
		ArrayList<String>cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		System.out.println(ar1.contains("Red"));
		System.out.println(ar1.contains("Pink"));
		System.out.println(ar1.indexOf("White")>0);
		
		ArrayList<String> List1 = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Ram", "Steve"));
		System.out.println(List1);
		
		int i = List1.lastIndexOf("Steve");
		System.out.println(i);
		
		List1.remove(1);
		System.out.println(List1);
		
		List1.remove("Ram");
		System.out.println(List1);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num -> num%2 == 0);
		System.out.println(numbers);
		
		ArrayList<String>namesList = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Ram", "Steve"));
		System.out.println(namesList);
		
		namesList.retainAll(Collections.singleton("Tom"));
		System.out.println(namesList);
		
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(subList);
		
		ArrayList<String> newList = new ArrayList<String> (
				Arrays.asList("Naveen", "Tom", "Ram", "Steve"));
		Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o : arr) {
			System.out.println((String)o);
		}
	}

}
