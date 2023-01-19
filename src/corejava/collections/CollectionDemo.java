package corejava.collections;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		int a[] = {4,4,5,5,5,6,6,9,4,3};
		//output - 4 - 3 times, 5 - 3 times, 6 - 2 times , 9 - 1
		//Output Unique number - 9
		
		//Algorithms
		//Step - 1 - Create an empty ArrayList and Pass 4 into the ArrayList
		
		ArrayList ab = new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i] + " is present " + k + " times");
				if(k==1)
				{
					System.out.println(a[i]+ " is a unique number");
				}
			}		
		}
	}
}
