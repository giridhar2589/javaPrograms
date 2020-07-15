package programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swapWithoutTemp(5,8);
		swapWithTemp(5,8);
	}
	
	
	//Swaping of variables with using temp number
	 static void swapWithoutTemp(int a, int b){
		
		  a= a+b;
		  b=a-b;
		  a=a-b;
		
		System.out.println("values of a "+a);
		System.out.println("values of b "+b);
	}

	 
	//Swaping of variables with using temp number
		 static void swapWithTemp(int a, int b){
			
			  int temp= a;
			  a=b;
			  b=temp;
			
			System.out.println("values of a "+a);
			System.out.println("values of b "+b);
		}

	 
}
