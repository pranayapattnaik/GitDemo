package corejava;

public class NestedForLoopAssignement {

	public static void main(String[] args) {
		
		//Output
		//1 2 3 4
		//5 6 7
		//8 9
		//10
		
		int k=1;
		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=4-i;j++)// inner loop
			{
				//System.out.print(k + ' ');--> one way
				System.out.print(k);
				System.out.print('\t');
				k++;
			}
			System.out.println();
		}
		
	}

}
