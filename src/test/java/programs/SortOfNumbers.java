package programs;

public class SortOfNumbers {
	
	
	
	
	//Sorting  of array using bubble sort technique
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,1,7,5,9,54};
		
		
		for (int i=0;i<a.length;i++) {
			
			
			for(int j=i+1;j<a.length;j++) {
				
			if(a[i] > a[j]) {
				int temp = a[i]; 
				a[i]=a[j];
				a[j]=temp;
			}
			 
			}
			
		}
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	
	
	
	
}
