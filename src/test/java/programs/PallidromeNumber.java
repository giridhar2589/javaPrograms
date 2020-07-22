package programs;

public class PallidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PallidromeInt(909);
	}

	
	static void PallidromeInt(int value) {
		
		String a= Integer.toString(value);
		String  temp="";
		
		for (int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		System.out.println(temp);
		 
		if (temp.equals(a)) {
			System.out.println("its pallindrome");
			
		}
		else
		{
			System.out.println("its not pallindrome");
		}
			}
	
}
