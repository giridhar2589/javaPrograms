package programs;

public class fibanocciSeries {


	public static void main(String[] args) {
		FibanoociSeries(9);
	}

	static void FibanoociSeries(int n){

		int a =0;
		int b=1;
		int i=1;
		int sum=0;
		while(i<n) {
			System.out.println(sum);
			sum=a+b;
			
			a=b;
			b=sum;
			i++;
		}
		
		
	}


}
