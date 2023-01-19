package corejava;

public class NestedForLoopAssignement1 {

	public static void main(String[] args) {
		
		//Output
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		
		int k=1;
		for(int i=1; i<=4; i++) 
		//for(int i=0; i<4;i++)
		{
			for(int j=0; j<i;j++)
			//for(int j=0; j<=i;j++)//this also works if i=0;
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
