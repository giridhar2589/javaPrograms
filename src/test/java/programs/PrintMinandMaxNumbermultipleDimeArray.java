package programs;

public class PrintMinandMaxNumbermultipleDimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		minimumnumber();
		maximumumber();
	}
	
	static void minimumnumber() {
		int a[][]= {{13,15,47,},{58,69,55},{25,43,37}};

		int min =a[0][0];
		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				if (a[i][j]<min) {
					min=a[i][j]; 
				}

			}
			
		}
		System.out.println("minimun number is:"+min);	
	}
	
	
	
	
	static void maximumumber() {
		int b[][]= {{3,5,7,},{8,9,12},{9,43,7}};

		int max =b[0][0];
		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				if (b[i][j]>max) {
					max=b[i][j]; 
					System.out.println(max);
				}
				
			}
			
		}
		System.out.println("maximum number is:"+max);	
	}
	
}
