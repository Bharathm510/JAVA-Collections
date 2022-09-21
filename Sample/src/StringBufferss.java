
public class StringBufferss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		   String str1 = "BHA", str2 = "BHA";
		    StringBuffer strbuf = new StringBuffer(str1);
		    
		    System.out.println(str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
		    
		    System.out.println(str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
		    
		      }
		}
