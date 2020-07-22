package programs;

import java.util.ArrayList;

public class PrintuniqueNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {5,2,3,3,2,1,3,4,4,1,3,5,7,6,1,6};

		//create empty array list
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		for (int i=0;i<a.length;i++) {
			int k=0;


			if(!a1.contains(a[i])){

				a1.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {

					if(a[i]==a[j]) {
						k++;
					}

				}
				
				if(k==1)
				System.out.println("Unique number is "+a[i]);
				

			}


		}


	}

}


