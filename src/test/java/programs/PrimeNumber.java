package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Primenumber(9);
	}

	static void Primenumber(int n) {

		boolean flag=false;
		for(int i=2;i<n/2;i++) {




			if(n%i==0) {

				flag=true;

				break;
			}

		}
		if(flag) {

			System.out.println("this is not prime number");
		}
		else
		{
			System.out.println("This value is prime");
		}


	}

}
