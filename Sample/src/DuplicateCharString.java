
public class DuplicateCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Bharath";
		int length = str.length();
		char[] ch = str.toCharArray();
		for (int i=0; i<length; i++) {
			for(int j=1+i; j< length; j++) {
				if(ch[i] == ch[j]) {
					System.out.println("Duplicate characters are:" +ch[j]);
					break;
				}
			}
		}
	}

}
