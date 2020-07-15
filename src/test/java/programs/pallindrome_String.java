package programs;

public class pallindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pallidrome("madam");

}
	
	
	
	
	static void pallidrome(String names) {
		String name = names;
		String temp="";
		

		for(int i=name.length()-1;i>=0;i--) {

			//System.out.println(name.charAt(i));
			 temp= temp +name.charAt(i);
		}
		System.out.println(temp);
 
if (temp.equals(name)) {
	System.out.println("its pallindrome");
	
}
else
{
	System.out.println("its not pallindrome");
}
	}
}