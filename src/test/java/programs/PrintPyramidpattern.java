package programs;

public class PrintPyramidpattern {
/*
 *     
 * *
 * * *
 * * * *
 * 
 */
	
	
	
	//Print the * in the pryamid patterns
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*");
		
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				System.out.print("\t");
			}
			
			System.out.println();
		}
	}

}
